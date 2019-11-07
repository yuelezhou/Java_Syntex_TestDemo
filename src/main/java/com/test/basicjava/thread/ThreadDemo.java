package com.test.basicjava.thread;

public class ThreadDemo implements Runnable{
    private ThreadFoo threadFoo = new ThreadFoo();

    @Override
    public void run() {
        while (threadFoo.i>0) {
            synchronized (threadFoo) {
                try {
                    System.out.println("当前的线程值为" + Thread.currentThread().getName());
                    threadFoo.foo();
                    Thread.sleep(1000);

                } catch (Exception e) {
                    System.out.println("Exception");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        Thread thread2 = new Thread(threadDemo);
        thread.setName("线程1");
        thread2.setName("线程2");

        try {
            thread.start();
            thread2.start();
           // thread.wait();
            thread.join();

        }catch (Exception e){

        }


    }
}



