package Threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public Integer call() throws InvalidParamaterException, InterruptedException {

        int fact = 1;
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1500);
        if(number < 0)
            throw new InvalidParamaterException("Number must be positive");

        for(int count=number;count>1;count--){
            fact=fact * count;
        }

        return fact;
    }

    private class InvalidParamaterException extends Exception {
        public InvalidParamaterException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws Exception {
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);

        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<>();

        //Create MyCallable instance
        Callable<String> callable = new MyCallable();

        for(int i=0; i< 100; i++){

            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);

            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();


    }
}