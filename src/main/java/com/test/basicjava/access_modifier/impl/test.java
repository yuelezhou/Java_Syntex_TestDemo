package com.test.basicjava.access_modifier.impl;
import com.test.basicjava.access_modifier.Child;
import com.test.basicjava.access_modifier.Parent;

public class test{
    
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        String name_parent = parent.getName();
        String name_child = child.getName();
        System.out.println(name_child);
        


    }

}

