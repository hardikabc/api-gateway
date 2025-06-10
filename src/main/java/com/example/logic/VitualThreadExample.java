package com.example.logic;

import java.util.ArrayList;
import java.util.List;

public class VitualThreadExample {

    public static void main (String args[]) throws InterruptedException {
        final int threadCount=500000;
        List<Thread> threads=new ArrayList<>();

        Runnable runnable=()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        for( int i=0; i<threadCount; i++){
            Thread thread=new Thread(runnable);
            thread.setName("Thread "+i);
            thread.start();
            System.out.println("Thread Number :::"+i);
            threads.add(thread);
        }
        for (Thread thread:threads){
            thread.join();
            System.out.println("Completed 1:: "+thread.getName());
            System.out.println("Completed 2:: "+thread.getName());
            System.out.println("Completed 3:: "+thread.getName());
            System.out.println("Completed 4:: "+thread.getName());
            System.out.println("Completed 5:: "+thread.getName());
        }

    }
}
