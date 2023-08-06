package com.example.spring_fifty_edition.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {

    @Id
    private final  String id; // lambook 사용하여 final  자동 초기화 getter setter 자동 셋팅
    private final  String name;
    private final Type type;

    public Ingredient(){
        this.id = null;
        this.name = null;
        this.type = null;

    }


    public  static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


}
