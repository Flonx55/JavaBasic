package com.Flonx2;

/**
 * @Auther:Flonx
 * @Date:2021/1/2 - 01 - 02 - 14:46
 * @Description: com.Flonx2
 * @Version: 1.0
 */
public class TestThis {
//    The class will be loaded when run it the first time and it only be loaded just once
//    "this" refers to the current object
    int age ;
    String name;
    double height;
    //Empty parameter constructor
    public TestThis(){

    }

    public TestThis(int age ,String name,double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public void eat(){
        int age = 10;
        System.out.println(this.age);//principle of proximity
        System.out.println("I like eat");
    }
    public void play(){
//        System.out.println("eat food");
        this.eatFood();
        System.out.println("surf the Internet");
        System.out.println("have a shower");
    }
    public void eatFood(){
        System.out.println("eat food");
    }


}
