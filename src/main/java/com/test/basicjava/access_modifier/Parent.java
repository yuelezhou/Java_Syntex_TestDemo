package com.test.basicjava.access_modifier;

public class Parent {
    private String nickname ="abc";
    int age = 35;
    protected int hight = 180;
    public String name ="bob";
    
    public Parent(){}

     /**
     * @return the nickname
     */
    private String getNickname() {
        return nickname;
    }
    
    /**
     * @return the age
     */
    int getAge() {
        return age;
    }

   /**
     * @return the hight
     */
    protected int getHight() {
        return hight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    
    

    



}