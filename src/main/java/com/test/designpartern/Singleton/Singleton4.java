package com.test.designpartern.Singleton;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 16:11 2020-04-04
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class Singleton4 {
    /*内部类被加载和初始化时，才创建instance对象，静态内部类不会随着外部类的加载和初始化而初始化，
    它要单独加载和初始化，因为实在内部类加载和初始化时创建的，因此时线程安全的
    */
    private Singleton4() {
    }

    private static class Inner{
       private static Singleton4 instance = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return Inner.instance;
    }

}
