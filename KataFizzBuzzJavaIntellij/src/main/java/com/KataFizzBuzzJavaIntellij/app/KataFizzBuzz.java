package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午2:28
 */
public class KataFizzBuzz {
    public static String sayNumber(int number) {
        if(number%15 == 0){
            return  "FizzBuzz";
        }
        if(number%3 == 0){
            return  "Fizz";
        }
        if(number%5 == 0){
            return  "Buzz";
        }
        return number+"";
    }
}
