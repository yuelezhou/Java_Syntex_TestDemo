package com.test.basicjava.equals;

public abstract class AbstractTest1 {
    public static int a = 5;
    private int b = 10;
    public String string = "abc";
    public void cry(){};
    private void cry1(int a){};
    public static void cry2(){
        System.out.println("i'm cry2");
    };
    public abstract void cry3(int a);
    public abstract void cry4();


}

/*public class AbstractTestDemo extends AbstractTest1 {
    public void cry3(){
        System.out.println("i'm cry3 in demo");
    }


    public static void main(String[] args) {
        AbstractTestDemo abstractTestDemo = new AbstractTestDemo();
        abstractTestDemo.cry3();
    }
}*/