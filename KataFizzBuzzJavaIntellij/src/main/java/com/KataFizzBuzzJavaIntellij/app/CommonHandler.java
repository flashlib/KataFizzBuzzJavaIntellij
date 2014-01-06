package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午4:03
 */
public class CommonHandler extends KataFizzBuzzHandler {
    public CommonHandler(KataFizzBuzzHandler successor) {
        this.successor = successor;
    }

    @Override
    public String handle(int number) {
        return "" + number;
    }
}
