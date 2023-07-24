package com.example.spring_action_second;

import com.example.spring_action_second.CdPlayerConfig;
import com.example.spring_action_second.CompactDisc;
import com.example.spring_action_second.CdPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {


    @Autowired()
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }}

