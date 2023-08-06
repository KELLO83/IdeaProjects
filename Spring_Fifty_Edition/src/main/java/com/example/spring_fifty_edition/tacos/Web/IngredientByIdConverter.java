package com.example.spring_fifty_edition.tacos.Web;


import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.spring_fifty_edition.tacos.Ingredient;
import com.example.spring_fifty_edition.tacos.data.IngredientRepository;

import java.util.Optional;


@Component // Spring bean 등록

public class IngredientByIdConverter  implements Converter<String,Ingredient>{
 // DB IngredientRepo 에서 가져와서 Ingredient 객체로 변환
    private IngredientRepository ingredientRepository;
    @Autowired
    public  IngredientByIdConverter(IngredientRepository ingredientRepository){
        this.ingredientRepository = ingredientRepository;
    }
    @Override
    public Ingredient convert(String id) { //CURD로 인한 코드 변경
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(id);
        return optionalIngredient.isPresent() ?
                optionalIngredient.get() : null;
    }

}
