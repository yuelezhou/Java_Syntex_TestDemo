package com.test.basicjava.innerclass.memberInnerClass;

public class MemberInnerClass {
    public static String name = "bob";
    private int age = 20;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MemberInnerClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class Sister{
        //不允许有静态属性，静态属性一定是 static final

        //public static String name;
        public String name = "alice";
        public static final String firstName = "zhou";

        private int age = 12;
        public void sayOuter(){
            System.out.println("outer:"+MemberInnerClass.this.name +",age:"+MemberInnerClass.this.age);
            System.out.println(MemberInnerClass.getName());
        }

        /*不允许有静态方法
        public static sayNumber(){
            System.out.println(1);
        }*/
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.Sister sister = memberInnerClass.new Sister();
        sister.sayOuter();

    }
}
