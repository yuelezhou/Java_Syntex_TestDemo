package com.test.exercise; 
import java.util.ArrayList;




public class Demo{

    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setNum(Integer.parseInt("2.0"));
        System.out.println(demo.num);
    }
    

}
