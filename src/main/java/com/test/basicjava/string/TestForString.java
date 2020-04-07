package com.test.basicjava.string;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 08:44 2020-04-07
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class TestForString {
    String str = new String("hello");
    char ch[] = {'a','b','c'};
    public void fun(String str,char ch[]){
        str = "world";
        ch[0]='d';
    }

    public static void main(String[] args) {
        TestForString testForString = new TestForString();
        testForString.fun(testForString.str,testForString.ch);
        System.out.println(testForString.str);
        System.out.println(testForString.ch);
    }
}
