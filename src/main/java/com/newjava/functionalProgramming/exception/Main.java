package com.newjava.functionalProgramming.exception;


public class Main {
    public static void main(String arg[]) {

        System.out.println( ExceptionTester.exception(() -> Service.getData(), new NullPointerException()));


    }
}


/// one interface which should be functional.
// service where we will be having our actual functions.
// our class where we are going to run those function in funtions