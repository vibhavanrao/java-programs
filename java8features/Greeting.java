package com.vibhavan.java8features;

public class Greeting implements Greet{

    @Override
    public void greet(String msg){
        System.out.println(msg);
    }

}
