package com.test.basicjava.innerclass.anonymousInnerClass;

public abstract class Worker {
    private String name;
    private static int age;

    public Worker(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Worker.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int workTime();
}
