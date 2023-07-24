package com.example.spring_fifty_edition.tacos.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import  org.springframework.jdbc.core.RowMapper;

import com.example.spring_fifty_edition.tacos.Ingredient;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository // Component Scanning 을 통해 Bean 으로 등록 스프링 애플리케이션 컨텍스트 빈으로 등록
public class JdbcIngredientRepository implements IngredientRepository{

    private JdbcTemplate jdbc;
    @Autowired // 의존성 주입
    public JdbcIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Ingredient> findAll() {

        return jdbc.query("SELECT ID,NAME,TYPE FROM ingredient",
                this::mapRowToIngredient);
    }

    @Override
    public Ingredient findById(String id) { // 하나의 Ingredient 객체 반환
        return jdbc.queryForObject( // 하나의 객체만 반환
                "SELECT ID,NAME,TYPE FROM INGREDIENT WHERE ID=?",
                this::mapRowToIngredient, id); // 매개변수 id받은것을 세번째 인자로 받은후 WHERE ID =? 에서 ? 에 대입
    }

    @Override
    public Ingredient save(Ingredient ingredient) { //DB 데이터 추가하기
        jdbc.update(
                "INSERT INTO INGREDIENT (ID,NAME,TYPE) VALUES (?,?,?)",
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getType().toString());

        return  ingredient;

    }

    private  Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws  SQLException{
        return  new Ingredient(
                rs.getString("ID"),
                rs.getString("NAME"),
                Ingredient.Type.valueOf(rs.getString("TYPE")));
    }
}
