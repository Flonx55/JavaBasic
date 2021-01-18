package com.Flonx11;

/**
 * @Auther:Flonx
 * @Date:2021/1/15 - 01 - 15 - 8:46
 * @Description: com.Flonx11
 * @Version: 1.0
 */
public class Person {
    int age;
    String name;

    public Person(){
    super();
    }
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }


    public void eat(){
        System.out.println("eat");
    }


}
