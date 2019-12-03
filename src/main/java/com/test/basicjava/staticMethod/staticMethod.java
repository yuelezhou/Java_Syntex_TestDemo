package com.test.basicjava.staticMethod;


/*finally代码块在return中间执行。return的值会被放入临时空间，
然后执行finally代码块，如果finally中有return，会刷新临时空间的值，方法结束返回临时空间值。*/
//print 1/3/2
public class staticMethod {

    public static void main(String[] args) {
        System.out.println(test());
    }
    private static int test() {
        int temp = 1;
        try {
            System.out.println(temp);
            return ++temp;
        } catch (Exception e) {
            System.out.println(temp);
            return ++temp;
        } finally {
            ++temp;
            System.out.println(temp);
        }
    }
}
