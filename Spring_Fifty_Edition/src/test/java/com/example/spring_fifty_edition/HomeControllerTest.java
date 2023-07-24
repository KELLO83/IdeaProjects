package com.example.spring_fifty_edition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.hamcrest.Matchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // Add this import
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import org.junit.jupiter.api.Test;
import  org.springframework.test.web.servlet.MockMvc;


@WebMvcTest()
public class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc; // Dependency injection

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/home"))
                .andExpect(status().isOk()) // status 200
                .andExpect(view().name("home.html")) // view name
                .andExpect(content().string(Matchers.containsString("Welcome"))) // 성공 test passed
                .andDo(print());
    }



}
