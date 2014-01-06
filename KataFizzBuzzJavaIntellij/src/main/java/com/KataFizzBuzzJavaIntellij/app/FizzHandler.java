package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午4:24
 */
public class FizzHandler extends KataFizzBuzzHandler {
    public FizzHandler(KataFizzBuzzHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if (isFizzLikeNumber(number))
        {
            return "Fizz";
        }

            return this.successor.handle(number);
    }

}
