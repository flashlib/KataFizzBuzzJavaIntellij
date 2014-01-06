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

        assertEquals("3 should say 'Fizz'", KataFizzBuzz.WORD_FIZZ, KataFizzBuzz.sayNumber(3));
    }

    @Test
    public void fiveShouldSayBuzz(){

        assertEquals("5 should say 'Buzz'", KataFizzBuzz.WORD_BUZZ, KataFizzBuzz.sayNumber(5));
    }

    @Test
    public void sixShouldSayFizz(){

        assertEquals("6 should say 'Fizz'", KataFizzBuzz.WORD_FIZZ, KataFizzBuzz.sayNumber(6));
    }

    @Test
    public void tenShouldSayBuzz(){

        assertEquals("10 should say 'Buzz'", KataFizzBuzz.WORD_BUZZ, KataFizzBuzz.sayNumber(10));
    }

    @Test
    public void fifteenShouldSayFizzBuzz(){

        assertEquals("15 should say 'FizzBuzz'", KataFizzBuzz.WORD_FIZZ_BUZZ, KataFizzBuzz.sayNumber(15));
    }

    @Test
    public void thirteenShouldSayFizz(){

        assertEquals("13 should say 'Fizz'", KataFizzBuzz.WORD_FIZZ, KataFizzBuzz.sayNumber(13));
    }

    @Test
    public void thirtyoneShouldSayFizz(){

        assertEquals("31 should say 'Fizz'", KataFizzBuzz.WORD_FIZZ, KataFizzBuzz.sayNumber(31));
    }

    @Test
    public void thirtyfiveshouldSayFizzBuzz(){

        assertEquals("35 should say 'FizzBuzz'", KataFizzBuzz.WORD_FIZZ_BUZZ, KataFizzBuzz.sayNumber(35));
    }

}
