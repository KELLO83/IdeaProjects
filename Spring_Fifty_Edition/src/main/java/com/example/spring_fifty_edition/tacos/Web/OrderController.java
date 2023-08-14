package com.example.spring_fifty_edition.tacos.Web;
// tag::baseClass[]

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j; //SLF4J 는 로깅을 위한 인터페이스를 제공하는 라이브러리입니다 LOGEER 객체 생성.
import com.example.spring_fifty_edition.tacos.Order;


import org.springframework.validation.Errors; // 유효성 검사
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

//import com.example.spring_fifty_edition.tacos.data.OrderRepository;
import com.example.spring_fifty_edition.tacos.data.jdbcOrderRepository;
@Slf4j // Log 기록
@Controller// Componet discriminate
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

    private jdbcOrderRepository orderRepo;
    // private OrderRepository orderRepo; // DB 연결

    //@Autowired

    public OrderController(jdbcOrderRepository ord){
        this.orderRepo = ord;
    }
    @GetMapping("/current")
    public  String orderForm(){
        return "orderForm";
    }
    @PostMapping
    public  String processOrder(@Valid Order order , Errors errors , SessionStatus sessionStatus){

        if(errors.hasErrors()){ // 유효성 검사 실행
            return "orderForm"; // 유효성 검사 실패시 orderForm.html 이동
        }
        log.info("Order submitted: " + order); //@Slf4j logging

        orderRepo.save(order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
