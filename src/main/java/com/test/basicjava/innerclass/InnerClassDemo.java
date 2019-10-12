package com.test.basicjava.innerclass;

import javax.swing.*;

public class InnerClassDemo {
    private String name;
    private int age;
    public class son {
        public String name;
        public int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    private class son1 {
        private String name;
        private int age;
        //private static String message;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    private static class son2 {
        private String name;
        private int age;
        private static String message;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        //todo 内部类如何使用
        Integer a= 500;
        Integer b = 500;
        System.out.println(a==b);
        System.out.println(",");
        System.out.println(a!=b);

    }

}
