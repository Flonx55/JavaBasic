package com.Flonx.TestToString;

/**
 * @Auther:Flonx
 * @Date:2021/1/17 - 01 - 17 - 8:21
 * @Description: com.Flonx.TestToString
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student() {

    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString(){
        return "这是一个Student对象,这个对象的名字:"+name+"年龄:"+age+"身高:"+height;
    }
}
