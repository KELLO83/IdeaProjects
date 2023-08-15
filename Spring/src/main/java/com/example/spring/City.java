package com.example.spring;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class City {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private final String city_id;
    private final String city;
    private final String country_id;
    private final Date last_update;


}
