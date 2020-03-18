package com.test.basicjava.access_modifier;

public class Child extends Parent{
    private String nickname ="cba";
    int age = 5;
    protected int hight = 70;
    public String name ="joe";
    
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
    public void getParentAttribute(){
       int age=super.getAge();
       System.out.println(age);
    }

public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();
    //parent.
    child.getParentAttribute();
    
}
}