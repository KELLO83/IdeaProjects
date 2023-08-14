package com.example.spring.data;

import com.example.spring.Actor;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository {
    Iterable<Actor> findAll();
    Actor findById(int id);
    Actor save(Actor actor);

}
