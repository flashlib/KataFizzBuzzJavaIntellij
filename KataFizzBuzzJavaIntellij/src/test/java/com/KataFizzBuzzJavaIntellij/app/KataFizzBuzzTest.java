package com.KataFizzBuzzJavaIntellij.app;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午2:16
 */
public class KataFizzBuzzTest {



    @Test
    public void oneShouldSayOne(){
        //KataFizzBuzz kata = new KataFizzBuzz();
        //int number=1;
        //String value =kata.sayNumber(1);
        assertEquals("1 should say '1'", "1", KataFizzBuzz.sayNumber(1));
    }

    @Test
    public void twoShouldSayTwo(){

        assertEquals("2 should say '2'", "2", KataFizzBuzz.sayNumber(2));
    }

    @Test
    public void threeShouldSayFizz(){

        assertEquals("3 should say 'Fizz'", "Fizz", KataFizzBuzz.sayNumber(3));
    }

    @Test
    public void fiveShouldSayBuzz(){

        assertEquals("5 should say 'Buzz'", "Buzz", KataFizzBuzz.sayNumber(5));
    }

    @Test
    public void sixShouldSayFizz(){

        assertEquals("6 should say 'Fizz'", "Fizz", KataFizzBuzz.sayNumber(6));
    }

    @Test
    public void tenShouldSayBuzz(){

        assertEquals("10 should say 'Buzz'", "Buzz", KataFizzBuzz.sayNumber(10));
    }

    @Test
    public void fifteenShouldSayFizzBuzz(){

        assertEquals("15 should say 'FizzBuzz'", "FizzBuzz", KataFizzBuzz.sayNumber(15));
    }
}
