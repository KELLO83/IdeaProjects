package com.example.spring_fifty_edition.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@RequiredArgsConstructor
public class Ingredient {

    private final  String id; // lambook 사용하여 final  자동 초기화 getter setter 자동 셋팅
    private final  String name;
    private final Type type;

    public  static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


}
