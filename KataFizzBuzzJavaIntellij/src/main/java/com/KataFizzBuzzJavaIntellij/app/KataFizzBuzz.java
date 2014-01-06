package com.KataFizzBuzzJavaIntellij.app;

import sun.management.counter.StringCounter;

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
        //if(number%15 == 0){
       //     return  WORD_FIZZ_BUZZ;
        //}
        boolean b = false;
        String s = "";

        if(number%3 == 0 || includeNumber(number,3)){
            s=WORD_FIZZ;
            b = true;
        }
        if(number%5 == 0 ){
            s+=WORD_BUZZ;
            b = true;
        }
       // if (number==13){
        //    return WORD_FIZZ;
       // }
        if(!b){
            s = String.valueOf(number);
        }
        return s;
    }

    public static boolean includeNumber(int original, int num){

        String s = String.valueOf(original);
        return s.contains(String.valueOf(num));

        //for(int i=0; i < s.length(); i++){
        //    if(s.indexOf(i) == num){
        //        return true;
        //    }
       // }

       // return false;

    }
}
