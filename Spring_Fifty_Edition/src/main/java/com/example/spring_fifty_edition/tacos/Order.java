package com.example.spring_fifty_edition.tacos;

import lombok.Data; // lambok @Data 노가다성 코드 줄인다
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.CreditCardNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.example.spring_fifty_edition.tacos.Taco;
import com.example.spring_fifty_edition.tacos.data.OrderRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import lombok.extern.slf4j.Slf4j;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Slf4j // LOG 기록
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
@Data
@Entity // JPA 객체 선언
@Table(name="Taco_Order") // DB 테이블명 직접 명시 가능
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동부여 ID
    private  long id;
    private Date placedAt;

    @ManyToMany(targetEntity = Taco.class)
    private List<Taco> tacos = new ArrayList<>();

    @NotBlank(message = "Name is required")
    private String deliveryName;
    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @NotBlank(message = "City is required")
    private String deliveryCity;

    @NotBlank(message = "State is required")
    private String deliveryState;

    @NotBlank(message = "Zip code is required")
    private String deliveryZip;


    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$"
            ,message = "Must be formatted MM/YY")

    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
     private String ccCVV;

    public  void addDesign(Taco design){
        this.tacos.add(design);
    }

    @PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }
}
