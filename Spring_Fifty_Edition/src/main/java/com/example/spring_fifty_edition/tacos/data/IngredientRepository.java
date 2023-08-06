package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;
public interface IngredientRepository  extends CrudRepository<Ingredient, String>{
//    Iterable<Ingredient> findAll();
//    Ingredient findById(String id);
//    Ingredient save(Ingredient ingredient);
}
