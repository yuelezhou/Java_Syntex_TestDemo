package com.test.basicjava.comparator;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 13:50 2020-05-11
 * @ Description：
 * @ Modified By：
 * @Version: $
 */

public class MyComparator {
    public static void main(String[] args) {
//        List<People> peoples = new ArrayList<>();
//        peoples.add(new People("bob",5555.55, 55));
//        peoples.add(new People("coc",4444.44, 44));
//        peoples.add(new People("dod",3333.33, 33));
//        Collections.sort(peoples, new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//               return   o1.getSalary() > o2.getSalary() ? 1 : ((o1.getSalary() < o2.getSalary() ? -1 :0));
//            }
//        });
//
//        peoples.stream().forEach(System.out::println);
    }

    @Test
    public void test1(){
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("bob",5555.55, 55));
        peoples.add(new People("coc",4444.44, 44));
        peoples.add(new People("dod",3333.33, 33));
        Collections.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return   o1.getSalary() > o2.getSalary() ? 1 : ((o1.getSalary() < o2.getSalary() ? -1 :0));
            }
        });
        peoples.stream().forEach(System.out::println);
    }


    @Test
    public void test2(){
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("bob",5555.55, 55));
        peoples.add(new People("coc",4444.44, 44));
        peoples.add(new People("dod",3333.33, 33));
        Collections.sort(peoples,(e1,e2)-> {return - Double.valueOf(e1.getSalary() - e2.getSalary()).intValue();});
        peoples.stream().forEach(System.out::println);
    }


    @Test
    public void test3(){
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("bob",5555.55, 55));
        peoples.add(new People("coc",4444.44, 44));
        peoples.add(new People("dod",3333.33, 33));

        Comparator<People> comparator = Comparator.comparingDouble(People::getSalary);

        Collections.sort(peoples,comparator);
        peoples.stream().forEach(System.out::println);
        System.out.println("==============================");
        Collections.sort(peoples,comparator.reversed());
        peoples.stream().forEach(System.out::println);
    }


    @Test
    public void test4(){
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("bob",5555.55, 55));
        peoples.add(new People("coc",4444.44, 44));
        peoples.add(new People("dod",3333.33, 33));
        peoples.add(new People("eoe",3333.33, 22));

        Comparator<People> comparator2 = Comparator.comparingDouble(x->x.getSalary());
        Collections.sort(peoples,comparator2);
        peoples.stream().forEach(System.out::println);
        System.out.println("==============================");
        Collections.sort(peoples,comparator2.thenComparingInt(x->x.getAge()));
        peoples.stream().forEach(System.out::println);


    }



}
