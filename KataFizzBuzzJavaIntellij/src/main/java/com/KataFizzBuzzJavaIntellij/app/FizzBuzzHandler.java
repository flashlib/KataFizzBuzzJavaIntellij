package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午4:40
 */
public class FizzBuzzHandler extends KataFizzBuzzHandler {
    @Override
    public String handle(int number) {
        if(number%5==0 && isFizzLikeNumber(number)) {
            return "FizzBuzz";
        } else {
            return this.successor.handle(number);
        }
    }

    public FizzBuzzHandler(KataFizzBuzzHandler buzzHandler) {
        super(buzzHandler);
    }
}
