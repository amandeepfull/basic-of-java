package com.newjava.java8.completableFuture;

import java.util.concurrent.*;


// link : https://www.callicoder.com/java-8-completablefuture-tutorial/


// Limitations of Future
// 1. It cannot be manually completed
// 2. you cannot perform further action on a Future's results without blocking
// 3. Multiple futures cannot be chained together
// 4. you can not combine multiple futures together
// 5. No Exception handling


// Methods:
// 1. runAsync : if we dont need to return  : CompletableFuture<Void>
// 2. supplyAsync :  if we need to return  : CompletableFuture<T>

public class CompletableFutureDemo {

    public static void main(String arg[]) throws ExecutionException, InterruptedException {

        ExecutorService cpoBound = Executors.newFixedThreadPool(4); // according to cpu cores, thread pool can be created to run cpu related operations
        ExecutorService ioBound =  Executors.newCachedThreadPool();  // can be created to use for processing db, api operations

        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Product()::order, cpoBound) //  without own excecutorService
                                                                 .thenApply(new Product()::payment) // if you need to run the process in diff thread we can use thenApplyAsync
                                                              //   .exceptionally(e -> "handling exception ") /// it can pass fail instance to further process, which is dispatch so that it can stop dispatching the order
                                                                 .thenApply(new Product()::dispatch)
                                                                  .thenApply(new Product()::sendEmail);

        System.out.println("order started....");

        // blocking and getting results

        System.out.println(future.get());



    }

}


class Product{

    public String order()  {

        // simulating long running job
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ordering...");
        return "ordered successfully";

    }

    public  String payment(String orderResult) {

        // simulating long running job
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(orderResult);
        System.out.println("processing payments...");

        return orderResult+" and started payment";

    }

    public String dispatch(String paymentResult){

        // simulating long running job
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dispatching....");
        return "dispatch is done";

    }

    public String sendEmail(String dispatched){

        System.out.println("sending mail .....");
        return "mail sent successfully";

    }






}
