package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
