package com.newjava;

public class LearnLambadaImpl implements LearnLambada{

    @Override
    public void doSomething(int a) {
        System.out.println("implementation : "+a);
    }


    public static void main(String arg[]){

        LearnLambada learnLambada = a -> System.out.println("annonmous :"+a);

        learnLambada.doSomething(4);
    }
}
