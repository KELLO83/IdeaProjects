package com.example.spring_action_first;
import static org.junit.Assert.*;

import com.example.spring_action_first.SoundSystem.CDPlayerConfig;
import com.example.spring_action_first.SoundSystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {


    @Autowired()
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }




}
