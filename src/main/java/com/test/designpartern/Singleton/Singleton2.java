package com.test.designpartern.Singleton;

import java.util.concurrent.*;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:47 2020-04-04
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class Singleton2 {
    private static Singleton2 instance;

    public Singleton2() {
    }

    public static Singleton2 getInstane() {
        if (instance != null) {
            return instance;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        instance = new Singleton2();
        return instance;
    }

    public static void main(String[] args) {
       //单线程
        /* Singleton2 s1 = Singleton2.getInstane();
        Singleton2 s2 = Singleton2.getInstane();
        System.out.println(s1 == s2);*/

        //多线程
        Callable<Singleton2> call = new Callable<Singleton2>() {
            public Singleton2 call() throws Exception {
                return Singleton2.getInstane();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton2> future1 = executorService.submit(call);
        Future<Singleton2> future2 = executorService.submit(call);

        try {
            Singleton2 s1 = future1.get();
            Singleton2 s2 = future2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Singleton2 s1 = Singleton2.getInstane();
        Singleton2 s2 = Singleton2.getInstane();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
