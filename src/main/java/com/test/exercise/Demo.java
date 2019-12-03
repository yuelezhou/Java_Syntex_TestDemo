package com.test.exercise; 
import java.util.ArrayList;




public class Demo{

    public void numQuest(ArrayList nums) {
        int k = 0;
        Integer zero = new Integer(0);
        while (k < nums.size()) {
            if (nums.get(k).equals(zero))
            nums.remove(k);
            k++;
        }   
    }
    
    public static void main(String[] args) {
        Demo demo = new Demo();
        ArrayList nums =new ArrayList();
        nums =  [0，0，4，2，5，0，3，0];
        demo.numQuest(nums);
        System.out.println(nums);

        
    }
    

}
