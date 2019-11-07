package com.test.basicjava.staticblock;

public class StaticBlock {
    /*构造代码块/静态代码块/main函数 构造函数的初始化先后顺序*/

/*新建某个类后，优先将静态资源加载，即静态变量 staticBlock 和 staticBlock1 静态代码块，按照先后顺序逐一加载，所以优先输出
构造代码块
构造函数
构造代码块
构造函数
静态代码块
然后新建staticBlock的实例
构造代码块和
构造函数按照
*/


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

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
    }



}


/*静态代码块 》 构造代码块 》 构造函数 */