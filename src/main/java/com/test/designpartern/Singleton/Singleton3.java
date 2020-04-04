package com.test.designpartern.Singleton;

import java.util.concurrent.*;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 15:47 2020-04-04
 * @ Description：线程安全
 * @ Modified By：
 * @Version: $
 */
public class Singleton3 {
    private static Singleton3 instance;

    public Singleton3() {
    }

    public static Singleton3 getInstane() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton3.class) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton3();
        }
        return instance;
    }

    public static void main(String[] args) {
       //单线程
        /* Singleton2 s1 = Singleton2.getInstane();
        Singleton2 s2 = Singleton2.getInstane();
        System.out.println(s1 == s2);*/

        //多线程
        Callable<Singleton3> call = new Callable<Singleton3>() {
            public Singleton3 call() throws Exception {
                return Singleton3.getInstane();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton3> future1 = executorService.submit(call);
        Future<Singleton3> future2 = executorService.submit(call);

        try {
            Singleton3 s1 = future1.get();
            Singleton3 s2 = future2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Singleton3 s1 = Singleton3.getInstane();
        Singleton3 s2 = Singleton3.getInstane();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
