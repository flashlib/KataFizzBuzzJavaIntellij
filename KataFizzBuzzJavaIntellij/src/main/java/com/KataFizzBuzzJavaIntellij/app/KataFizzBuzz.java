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
    public static final String WORD_WHIZZ = "Whizz";
    public static final String WORD_FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public static String sayNumber(int number) {
//        boolean b = false;
//        String s = "";
//
//        if(number%3 == 0 || includeNumber(number,3)){
//            s=WORD_FIZZ;
//            b = true;
//        }
//        if(number%5 == 0 ){
//            s+=WORD_BUZZ;
//            b = true;
//        }
//        if(number%7 == 0 ){
//            s+=WORD_WHIZZ;
//            b = true;
//        }
//
//        if(!b){
//            s = String.valueOf(number);
//        }
//        return s;


        KataFizzBuzzHandler commonHandler = new CommonHandler(null);
        KataFizzBuzzHandler fizzHandler = new FizzHandler(commonHandler);
        KataFizzBuzzHandler buzzHandler = new BuzzHandler(fizzHandler);
        KataFizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler(buzzHandler);
        return fizzBuzzHandler.handle(number);

    }

    public static boolean includeNumber(int original, int num){
        String s = String.valueOf(original);
        return s.contains(String.valueOf(num));
    }
}
