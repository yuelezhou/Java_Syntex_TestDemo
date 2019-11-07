package com.test.basicjava.staticblock;


    public class Animal {
        //getClass()得到当前调用对象的类对象，Dog，getSuperClass()返回Animal类对象
        private String Tag = getClass().getSuperclass().getSimpleName();

        public int a;
        int b = 0;

        private static String staticTag = "Animal_STATIC";
        static {
            System.out.println(staticTag + "的静态域初始化");
        }

        public Animal() {
            System.out.println(Tag + "的无参构造函数" + a);
        }

        public String getTag() {
            return Tag;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public static String getStaticTag() {
            return staticTag;
        }
    }

