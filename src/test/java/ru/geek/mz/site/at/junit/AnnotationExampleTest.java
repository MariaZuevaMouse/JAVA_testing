package ru.geek.mz.site.at.junit;

import org.junit.jupiter.api.*;


import java.util.Random;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationExampleTest {

    @Test
    @Disabled
    public void test01(){
        assertTrue(true);
    }

    @DisplayName("existence test")
    @Test
    public void test02(){
        assertTrue(true);
    }

    @Test
    @DisplayName("int value test")
    @RepeatedTest(100)
    public void test03(){
        int x = new Random().nextInt(100);
        assertTrue(x > 50);
    }

    @Timeout(1)
    @Test
    public void test04() throws InterruptedException {
        sleep(1100);
        assertTrue(true);
    }


}
