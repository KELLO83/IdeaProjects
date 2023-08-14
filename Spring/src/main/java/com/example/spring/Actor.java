package com.example.spring;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Data
@RequiredArgsConstructor
public class Actor {
    private final int actorId;
    private final String firstName;

    private final String lastName;
    private final Date lastUpdate; // Add lastUpdate field


}
