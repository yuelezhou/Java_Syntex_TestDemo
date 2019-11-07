package com.test.basicjava.thread;

public class DoExercise {


    public static void main(String[] args) {
        ThreadExercise threadExercise = new ThreadExercise();
        Thread thread = new Thread(threadExercise);
        Thread thread1 = new Thread(threadExercise);
        thread.start();
        System.out.println(ThreadExercise.getA());
        thread1.start();
        System.out.println(ThreadExercise.getA());

    }


}
