package com.test.basicjava.thread;

public class ThreadFoo  {
    public int i =100;
    public void foo() throws Exception{
        System.out.println("调用了ThreadFoo类的"+this.getClass().getMethod("foo").getName());
        System.out.println("i的值为"+i);
        i--;
    }
}


