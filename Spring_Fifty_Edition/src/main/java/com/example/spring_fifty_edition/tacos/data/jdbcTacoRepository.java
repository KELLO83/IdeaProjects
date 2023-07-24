package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Ingredient;
import com.example.spring_fifty_edition.tacos.Taco;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.*;
import java.util.Arrays;
import java.util.Date;


@Repository // Component Scanning 을 통해 Bean 으로 등록 스프링 애플리케이션 컨텍스트 빈으로 등록
public class jdbcTacoRepository implements TacoRepository{

   private JdbcTemplate jdbc;



    public  jdbcTacoRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }
    @Override
    public Taco save(Taco taco) { // save taco 객체를 받는다
        long tacoId = saveTacoInfo(taco);  // saveTacoInfo 메소드를 사용하여 tacoID를 받는다
        taco.setId(tacoId);

        for(Ingredient ingredient : taco.getIngredients()){
            saveIngredientToTaco(ingredient,tacoId);
        }


        return  taco;

    }

    private void saveIngredientToTaco(Ingredient ingredient, long tacoId) {
        jdbc.update("insert into Taco_Ingredients (taco,ingredient) values (?,?)",
                tacoId,ingredient.getId()); // Ingredient 객체의 id를 사용하여 Taco_Ingredients 테이블에 저장
    }

    private long saveTacoInfo(Taco taco)   {
        taco.setCreatedAt(new Date()); // 현재 날짜를 createdAt 에 저장


        //책 내용
//        PreparedStatementCreator psc = new PreparedStatementCreatorFactory(
//                "insert  into Taco (name,createdAt) values (?,?)",
//                Types.VARCHAR,Types.TIMESTAMP).newPreparedStatementCreator(Arrays.asList(taco.getName()
//        ,new Timestamp(taco.getCreatedAt().getTime()))); // PreparedStatementCreatorFactory 를 사용하여 PreparedStatementCreator 생성


        //수정

        PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(
                "insert  into Taco (name,createdAt) values (?,?)",
                Types.VARCHAR,Types.TIMESTAMP);
        pscf.setReturnGeneratedKeys(true); // 자동 증가된 id값을 받기 위해 true 로 설정

        PreparedStatementCreator psc = pscf.newPreparedStatementCreator(Arrays.asList(taco.getName()
                ,new Timestamp(taco.getCreatedAt().getTime()))); // PreparedStatementCreatorFactory 를 사용하여 PreparedStatementCreator 생성


        //끝단

        // TMI.... taco.getCretedAt() @Data 어노테이션으로 인한 게터 세터 자동 생성

        KeyHolder keyHolder = new GeneratedKeyHolder(); // KeyHolder 를 사용하여 생성된 키를 받는다 auto_Incremental  칼럼 자동증가
        jdbc.update(psc,keyHolder); // taco 칼럼 id auto_increment 로써 GeneratedKeyHolder  자동 증가 값 받기

        if(keyHolder.getKey() == null){ // Debug 확인용
            System.out.println("keyHolder is null error");
            throw new RuntimeException("keyHolder is null error");
        }

        return keyHolder.getKey().longValue(); // 자동증가된 id값을 long 값으로 반환받는다

    }
}
