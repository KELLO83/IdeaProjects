//package com.example.spring_fifty_edition.tacos.data;
//
//
//import  java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import lombok.Data;
//import  org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import com.example.spring_fifty_edition.tacos.Taco;
//import com.example.spring_fifty_edition.tacos.Order;
//
//
//@Repository // // Component Scanning 을 통해 Bean 으로 등록 스프링 애플리케이션 컨텍스트 빈으로 등록
//public class jdbcOrderRepository {
//    private SimpleJdbcInsert orderInserter;
//    private SimpleJdbcInsert orderTacoInserter;
//    private ObjectMapper objectMapper;
//
//    @Autowired // 의존성 주입
//    public jdbcOrderRepository(JdbcTemplate jdbc){
//        this.orderInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order")
//                .usingGeneratedKeyColumns("id"); // Taco_Order 테이블의 id 컬럼을 자동으로 생성
//
//        this.orderTacoInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order_Tacos");
//
//        this.objectMapper = new ObjectMapper();
//    }
//
//
//
//    public  Order save(Order order){ // Order 및 이것과 연관된 Taco 객체들을 처리하는 메소드 save
//        order.setPlacedAt((Data) new Date());
//        long orderId = saveOrderDetails(order); // 실제로 저장 logic 전달
//        order.setId(orderId);
//        List<Taco> tacos = order.getTacos();
//
//        for(Taco taco : tacos){
//            saveTacoToOrder(taco, orderId);
//        }
//
//        return order;
//    }
//
//    private void saveTacoToOrder(Taco taco, long orderId) {
//
//        Map<String , Object> values = new HashMap<>();
//        values.put("tacoOrder", orderId);
//        values.put("taco", taco.getId());
//        orderTacoInserter.execute(values);
//    }
//
//    private long saveOrderDetails(Order order) { // DB 저장 로직
//        @SuppressWarnings("unchecked") // warning  제거
//        Map<String , Object> values = objectMapper.convertValue(order, Map.class); // Order 를 Map 으로 변경하기 (ObjectMapper)
//        values.put("placedAt", order.getPlacedAt());
//
//        long orderId = orderInserter.executeAndReturnKey(values).longValue();
//        return orderId;
//    }
//}
