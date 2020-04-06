package com.test.basicjava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 13:58 2020-04-06
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i<5; i++){
            pool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "is running");
                }
            });
        }
    }
}
