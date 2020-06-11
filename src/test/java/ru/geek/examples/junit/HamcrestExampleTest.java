package ru.geek.examples.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsSame.sameInstance;
@Disabled
public class HamcrestExampleTest {
    @Test
    public void test01(){
        int a = 5;
        Object object = new Object();
        Object object1 = object;
        assertThat(a, equalTo(5));
        assertThat(object, notNullValue());
        assertThat(object, sameInstance(object1));
    }

    @Test
    public void test02(){
        int a = 5;
        double a1 = 1.333;
        int b = 1;
        int c =-10;
        Integer z = 100;
        assertThat(a, lessThan(10));
        assertThat(c, greaterThan(-100));
        assertThat(a,lessThanOrEqualTo(5));
        assertThat(a1, closeTo(1.3, 0.1));
        assertThat(z, instanceOf(Number.class));
    }

    @Test
    public void test03(){
        String a = "hello";
        String b = "HELLO";
        assertThat(a, equalToIgnoringCase(b));
    }

    @Test
    public void test04(){
        int a = 5;
        assertThat(a, allOf(
                lessThan(10),
                lessThanOrEqualTo(5)
        ));
    }
    @Test
    public void test05(){
        int a = 5;
        assertThat(a, anyOf(
                lessThan(-5),
                lessThanOrEqualTo(5)
        ));
    }
    @Test
    public void test06(){
        int a = 5;
        assertThat(a, not(anyOf(
                lessThan(-5),
                lessThanOrEqualTo(-9)
        )));
    }
}
