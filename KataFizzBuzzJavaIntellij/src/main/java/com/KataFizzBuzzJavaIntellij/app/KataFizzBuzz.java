package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午2:28
 */
public class KataFizzBuzz {
    public static final String WORD_BUZZ = "Buzz";
    public static final String WORD_FIZZ = "Fizz";
    public static final String WORD_FIZZ_BUZZ = "FizzBuzz";

    public static String sayNumber(int number) {
        if(number%15 == 0){
            return  WORD_FIZZ_BUZZ;
        }
        if(number%3 == 0){
            return  WORD_FIZZ;
        }
        if(number%5 == 0){
            return  WORD_BUZZ;
        }
        if (number==13){
            return WORD_FIZZ;
        }
        return "" + number;
    }
}
