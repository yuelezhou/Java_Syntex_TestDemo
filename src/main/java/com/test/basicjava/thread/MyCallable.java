package com.test.basicjava.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 13:35 2020-04-06
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class MyCallable implements Callable<String> {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    public String call() throws Exception {
        return name;
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Future> futureList = new ArrayList<Future>();
        for(int i = 0;i<5 ; i++){
            Callable c = new MyCallable(i + "");
            Future future = pool.submit(c);
            System.out.println("submit a callable thread:" + i);
            futureList.add(future);
        }
        pool.shutdown();
        for (Future future: futureList){
            try {
                System.out.println("get the result from callable thread:"+ future.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}
