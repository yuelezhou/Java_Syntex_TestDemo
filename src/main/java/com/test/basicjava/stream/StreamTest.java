package com.test.basicjava.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 21:46 2020-05-07
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class StreamTest {
    //1通过Collection系列集合提供的stream()或parallelstream()

    //2通过Arrays中的静态方法stream（）

    //3通过Stream类中的静态方法

    //4 无限流

    public void test1(){
        //1通过Collection系列集合提供的stream()或parallelstream()

        List<String> list = new ArrayList<String>();
        Stream<String> stringStream = list.stream();


        //2通过Arrays中的静态方法stream（）
        People[] peoples = new People[10];
        Stream<People> peopleStream = Arrays.stream(peoples);

        //3通过Stream类中的静态方法

        Stream<Integer> integerStream = Stream.of(1,2,3);

        //4 无限流
        //迭代
        Stream.iterate(0,(x)->{ x=x+2;
            System.out.println(x+2);
            return x;
        }).limit(10).forEach(System.out::println);

        //生成
        Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);

    }



    @Test
    public void test2(){
        /*
        * 筛选与切片
        * filter一接收 Lambda，从流中排除某些元素。
        * limit一截断流， 使其元素不超过给定数量。
        * skip（n） 一跳过元素， 返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit（n）互补.
        * distinct一筛选， 通过流所生成元素的hashCode（）和equals（）去除重复元素
        * */
        List<People> peopleList = Arrays.asList(new People("bob",899.9,34),
                new People("cap",499.9,26),
                new People("bob",999.9,37),
                new People("bob",2999.9,56),
                new People("bob",1999.9,48)
                );

        Stream<People> stream =
        peopleList.stream().filter(x->{
            System.out.println("流处理的中间过程");
            return x.getAge()>37;
        });
        stream.forEach(System.out::println);
    }
}
