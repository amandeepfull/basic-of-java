package com.newjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class FutureTask {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(200);

    public static void main(String arg[]) throws InterruptedException, ExecutionException {

        System.out.println(System.currentTimeMillis());

        System.out.println("Submitting task");

        List<Future> tasks = new ArrayList<>();

        for(int i = 0 ; i< 200 ; i++) {

            factorial(20 + i);
           // tasks.add(threadPool.submit(task));
        }

        System.out.println("task is submitted");

//        while(!future.isDone()){
//            System.out.println("task is not completed yet ...");
//            Thread.sleep(10);
//        }

        System.out.println("task is completed, let's check result");


//        tasks.stream().forEach(future -> {
//            try {
//                System.out.println(future.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        });

        System.out.println(System.currentTimeMillis());

    }


    public static long factorial ( int number) throws InterruptedException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }

        System.out.println("call");
        for(int i = 0 ; i < 1000000 ; i ++){
            int j =i;
        }

        return 0;
    }

}
