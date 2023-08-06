package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco,Long> { // TACO REPOSITORY INTERFACE
    Taco save(Taco design);
}
