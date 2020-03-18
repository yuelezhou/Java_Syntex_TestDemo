package com.test.basicjava.innerclass.staticInnerClass;

public class StaticInnerClass {
    /* 外部类有 公有和私有属性方法，静态和非静态属性方法
       内部类有 公有和私有属性方法，静态和非静态属性方法

    * */
    public String name = "bob";
    private int age = 20;
    public static String first_name = "john";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getFirst_name() {
        return first_name;
    }

    public static class Sister{
        public String name = "jin";
        private int age = 12;
        public static String first_name = "john";

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static String getFirst_name() {
            return first_name;
        }

        public String getOuterName(){
             StaticInnerClass o= new StaticInnerClass();
             return o.getName();
        }
        public int getOuterAge(){
            StaticInnerClass o= new StaticInnerClass();
            return o.getAge();
        }

        public static void sayNumber(){
            System.out.println(1);
        }

    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        StaticInnerClass.Sister sister = new StaticInnerClass.Sister();
        System.out.println(sister.getOuterName());
        System.out.println(sister.getOuterAge());
        StaticInnerClass.Sister.sayNumber();
    }
}
