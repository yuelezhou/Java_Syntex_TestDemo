package com.test.basicjava.staticblock;

public class StaticBlock {
    /*构造代码块/静态代码块/main函数 构造函数的初始化先后顺序*/
    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
    }

    public static StaticBlock staticBlock = new StaticBlock();
    public static StaticBlock staticBlock1 = new StaticBlock();
    public StaticBlock staticBlock2 ;
    public StaticBlock(){
        System.out.println("构造函数");
    }
    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态代码块");
    }


}


/*静态代码块 》 构造代码块 》 构造函数 */