package com.test.basicjava.thread;

public class ThreadExercise implements Runnable {
    private static int a = 0;
    @Override
    public void run() {
        boolean isOdd = false;
        for(int i=1;i<=2;++i)
        {
            if(i%2==1){
                isOdd = true;
            }else isOdd = false;
            a+=i*(isOdd?1:-1);
        }
    }

    public static int getA() {
        return a;
    }
}



