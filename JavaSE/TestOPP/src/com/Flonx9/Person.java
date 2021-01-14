package com.Flonx9;

/**
 * @Auther:Flonx
 * @Date:2021/1/14 - 01 - 14 - 19:03
 * @Description: com.Flonx9
 * @Version: 1.0
 */
public class Person {
//    properties
    private int age;
    private String name;
    private double height;

//    provide getter n setter methods

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


//    methods
    public void eat(){
        System.out.println("eat...");
    }
    public void sleep(){
        System.out.println("sleep...");
    }
}
