package ru.geek.mz.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeerPubTest {


    @Test
    void isValidGuest() {
        BeerPub beerPub = new BeerPub();
        boolean testResult = beerPub.isValidGuest(18);
        Assertions.assertTrue(testResult);
    }

    @Test
    void isValidGuest2() {
        BeerPub beerPub = new BeerPub();
        boolean testResult = beerPub.isValidGuest(7);
        Assertions.assertFalse(testResult);
    }
    @Test
    void isValidGuest3() {
        BeerPub beerPub = new BeerPub();
        boolean testResult = beerPub.isValidGuest(7);
        Assertions.assertFalse(testResult);
    }

}