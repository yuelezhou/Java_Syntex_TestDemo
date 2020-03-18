package com.test.basicjava.innerclass.localInnerClass;

public class LocalInnerClass {
    public String name = "bob";
    private int bobage = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return bobage;
    }

    public void setAge(int age) {
        this.bobage = age;
    }

    public void sayLocal(){
        class Sister {
            public void sayOuter(){
                System.out.println(bobage);
            }
        }
        Sister sister = new Sister();
        sister.sayOuter();

    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.sayLocal();
    }
}
