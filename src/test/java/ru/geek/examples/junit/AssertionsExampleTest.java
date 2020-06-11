package ru.geek.examples.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

@Disabled
public class AssertionsExampleTest {
    @Test
    public void test01(){
        assertEquals(1,2,"This elements are not equal");
    }

    @Test
    public void test02(){
        int[] a = {0, 1};
        int[] b = {0, 1};
        assertArrayEquals(a, b);
    }

    @Test
    public void test03(){
        String a = null;
        String b = "String is not null";
        assertNull(a);
        assertNotNull(b);
    }

    @Test
    public void test04(){
        List<Integer> mylist = Arrays.asList(0, 1, 2);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            mylist.get(100);
        });
    }

    @Test
    public void test05(){
        assertTimeout(Duration.ofMillis(700),() ->{
            sleep(600);
        });
    }
}
