package com.newjava;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculation {


    public static class FactorialCalculator implements Callable<Long>

    {
        private int number;
        public FactorialCalculator(){

        }
    public FactorialCalculator( int number){
        this.number = number;
    }

        @Override
        public Long call () {
        long output = 0;
        try {
            System.out.println("call");
            output = factorial(number);

        } catch (InterruptedException ex) {
            Logger.getLogger(FutureTask.class.getName()).log(Level.SEVERE, null, ex);
        }

        return output;
    }

        public long factorial ( int number) throws InterruptedException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }

       for(int i = 0 ; i < 1000000 ; i ++){
            int j =i;
       }

        return 0;
    }
    }


}

