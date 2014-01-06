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
        assertEquals("One should say '1'", "1", KataFizzBuzz.sayNumber(1));
    }

    @Test
    public void threeShouldSayThree(){

        assertEquals("Three should say 'Fizz'", "Fizz", KataFizzBuzz.sayNumber(3));
    }
}
