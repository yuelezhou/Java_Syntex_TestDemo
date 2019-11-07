package com.test.basicjava.equals;

//import com.test.basicjava.innerclass.InnerClassDemo;

public class Equals  {
     static String str = "abcdef";


     public void foo(String str,String str2 ,String str3,char[] str4){
         System.out.println(str == str2);//true
         System.out.println(str.equals(str2));//true
         System.out.println(str2 == str3);//false
         System.out.println(str2.equals(str3));//true
         System.out.println(str.equals(str4));//false,类型不同



     }
    public static void main(String[] args) {
       // InnerClassDemo innerClassDemo = new InnerClassDemo();
        String str2 = "abc"+"def";
        String str3 = new String(str);
        char[] str4 = {'a','b','c','d','e','f'};
        Equals equals = new Equals();
        equals.foo(str,str2,str3,str4);
    }

    /*true
      true
      false
      true*/
    /*String 类型，  equals 比较内容， == 比较地址*/
}
