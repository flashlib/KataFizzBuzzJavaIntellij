package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午4:35
 */
public class BuzzHandler extends KataFizzBuzzHandler {
    @Override
    public String handle(int number) {
        if(number%5==0){
            return "Buzz";
        }
        else{
            return this.successor.handle(number);
        }
    }

    public BuzzHandler(KataFizzBuzzHandler fizzHandler) {
        super(fizzHandler);
    }
}
