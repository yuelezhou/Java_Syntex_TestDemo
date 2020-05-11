package com.test.basicjava.comparable;

import java.util.Arrays;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 11:23 2020-05-11
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class MyComparable {

    /*comparable 在java.lang 包下，只提供compareTo方法*/
    public static void main(String[] args) {
        People[] peoples = new People[3];
        peoples[0] = new People("bob",5555.55,55);
        peoples[1] = new People("coc",4444.44,44);
        peoples[2] = new People("dod",3333.33,33);
        Arrays.sort(peoples);
        Arrays.stream(peoples).forEach(System.out::println);
    }
}
