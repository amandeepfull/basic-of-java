package com.newjava;

@FunctionalInterface
public interface LearnLambada {

    void doSomething(int a);
     default void doNothing(char a){
         System.out.println("i will do nothing....");
   }
}
