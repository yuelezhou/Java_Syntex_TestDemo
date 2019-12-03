package com.test.basicjava.innerclass;
public class  InnerStaticClassDemo {
    public static String testString = "test innerclass";
    public String testString_ns = "test innerclass_none";
    public static int testInt = 5;
    public int testInt_ns =99;
    
    public static class InnerStatic {
        
        public static int testInt = 5;
        public int testInt_ns = 5;
        
        public void pringString(){
            System.out.println(testString +" "+testInt_ns);//内部静态类 非静态方法 调用外部类的 静态变量 和 非静态变量
            //System.out.println(testString_ns);
            //非静态方法不能操作 非静态变量
        }

    } 

public static void main(String[] args) {
    InnerStatic innerStatic = new InnerStaticClassDemo.InnerStatic();
    innerStatic.pringString();

}
}