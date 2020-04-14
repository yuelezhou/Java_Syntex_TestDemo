package com.test.basicjava.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 10:18 2020-04-14
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class MyReentrantLock {
    public ReentrantLock lock1 = new ReentrantLock();
    public ReentrantLock lock2 = new ReentrantLock();
    public Thread lock1(){
        Thread t = new Thread(new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            public void run() {
                try {
                    lock1.lockInterruptibly();
                    System.out.println("lock1（），获取lock1 完毕");
                    Thread.sleep(500);
                    lock2.lockInterruptibly();
                    System.out.println("lock1（），获取lock2 完毕");
                    System.out.println(Thread.currentThread().getName() + ",执行完毕！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    if (lock1.isHeldByCurrentThread()){
                        lock1.unlock();
                    }
                    if (lock2.isHeldByCurrentThread()){
                        lock2.unlock();
                    }
                    System.out.println(Thread.currentThread().getName() + ",退出。");
                }
            }
        });
        t.start();
        return t;
    }

    public Thread lock2(){
        Thread t = new Thread(new Runnable() {
            /**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see Thread#run()
             */
            public void run() {
                try {
                    lock2.lockInterruptibly();
                    System.out.println("lock2（），获取lock2 完毕");
                    Thread.sleep(500);
                    lock1.lockInterruptibly();
                    System.out.println("lock2（），获取lock1 完毕");
                    System.out.println(Thread.currentThread().getName() + ",执行完毕！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    if (lock2.isHeldByCurrentThread()){
                        lock2.unlock();
                    }
                    if (lock1.isHeldByCurrentThread()){
                        lock1.unlock();
                    }
                    System.out.println(Thread.currentThread().getName() + ",退出。");
                }
            }
        });
        t.start();
        return t;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        MyReentrantLock myReentrantLock = new MyReentrantLock();
        Thread thread1 = myReentrantLock.lock1();
        Thread thread2 = myReentrantLock.lock2();
        while (true){
            if (System.currentTimeMillis() - time > 3000){
                //System.out.println("线程2 在规定时间内没有获得锁，取消锁的申请");
                thread2.interrupt();
            }
        }
    }
}
