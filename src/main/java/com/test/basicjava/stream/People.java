package com.test.basicjava.stream;

import lombok.Data;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 21:48 2020-05-07
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Data
public class People {
    public String name;

    public double salary;

    public int age;

    public People(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
