package com.KataFizzBuzzJavaIntellij.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 14-1-6
 * Time: 下午4:02
 */
public abstract class KataFizzBuzzHandler {
    protected KataFizzBuzzHandler successor = null;
    public abstract String handle(int number);
    public KataFizzBuzzHandler(KataFizzBuzzHandler successor) {
        this.successor = successor;
    }


}
