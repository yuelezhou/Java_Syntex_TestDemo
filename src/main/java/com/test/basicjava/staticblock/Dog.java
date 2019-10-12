package com.test.basicjava.staticblock;


    public class Dog extends Animal {
        //getClass()得到当前调用对象的类对象，Dog
        private String Tag = getClass().getSimpleName();

        private int a = 2;

        private static String staticTag = "DOG_STATIC";
        static {
            System.out.println(staticTag + "的静态域初始化");
        }

        public Dog() {
            System.out.println(Tag + "的无参构造函数" + a);
        }

        public static void swimming() {
            System.out.println(staticTag + "调用静态方法swimming");
        }


        public static void main(String[] args) {
            Dog.swimming();
            System.out.println("---实例化对象---");
            new Dog();
        }


        /*Animal_STATIC的静态域初始化 —— 父类静态代码块
         DOG_STATIC的静态域初始化 —— 子类静态代码块
         DOG_STATIC调用静态方法swimming -静态方法
         ---实例化对象---
         Animal的无参构造函数0 -父类的实例构造函数
         Dog的无参构造函数2- 子类的实例构造函数 */
    }
