package com.test.basicjava.thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 14:08 2020-04-06
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds,repeat execute every 3 seconds");
            }
        },3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds,repeat execute every 3 seconds");
            }
        },1,3,TimeUnit.SECONDS);
    }
}
