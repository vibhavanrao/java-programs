package com.vibhavan.java8features;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //using other class

        Greeting greeting = new Greeting();
        greeting.greet("welcome every one....");

        //anonymous inner class usage

        Greet greet = new Greet() {
            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };
        greet.greet("this is created using anonymous inner class");

        //usage of lambda expression
         Greet greetings = (greetingMsg) -> System.out.println(greetingMsg);
         greetings.greet("hello everyone.......");

         //predicate it return the boolean value after executing the condition
        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
        System.out.println(isEvenPredicate.test(100));

        List<String> customerList = Arrays.asList("customer1","customer2","customer3");

        //using consumer
        Consumer<String> printCustomerList = name -> System.out.println(name);
        customerList.forEach(printCustomerList);

        //using lambda expression without method reference
        customerList.forEach(name -> System.out.println(name));
        //using lambda expression with method reference
        customerList.forEach(System.out::println);

        //Functions
        Function<String,String> convertToUpper = name ->{
            name = name.toUpperCase();
            return name;
        };

        customerList.forEach(name -> System.out.println(convertToUpper.apply(name)));
    }
}
