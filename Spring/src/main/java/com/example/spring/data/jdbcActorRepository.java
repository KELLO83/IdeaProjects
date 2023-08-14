package com.example.spring.data;

import com.example.spring.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import  org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class jdbcActorRepository implements ActorRepository{

    private  JdbcTemplate jdbc;

    @Autowired
    public jdbcActorRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;

    }

    @Override
    public Iterable<Actor> findAll() {
        return jdbc.query("SELECT ACTOR_ID,FIRST_NAME,LAST_NAME,LAST_UPDATE " +
                        "FROM ACTOR",
                this::mapRowToActor);
    }

    @Override
    public Actor findById(int id) {
        return null;
    }

    @Override
    public Actor save(Actor actor) {
        return null;
    }
    private Actor mapRowToActor(ResultSet rs ,int rowNum) throws SQLException{
        return new Actor(
                rs.getInt("ACTOR_ID"),
                rs.getString("FIRST_NAME"),
                rs.getString("LAST_NAME"),
                rs.getDate("LAST_UPDATE"));

    }
}
