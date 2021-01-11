package com.Flonx6;

/**
 * @Auther:Flonx
 * @Date:2021/1/9 - 01 - 09 - 21:11
 * @Description: com.Flonx6
 * @Version: 1.0
 */
public class Girl {
    private  int age = 0;
    private int sno;
    private String name;
    private double height;

//
    public int getAge() {
        return age;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
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
//    封装:将某些东西隐藏,然后提供相应的方式进行获取
//    所以private其实不算封装,没有提供相应的方式进行获取
//    一般是加了限制访问修饰符的基础上,通过写方法

//
//    读取年龄
    public int readAge(){
        return age;
    }
//    设置年龄
    public void setAge(int age){
        if (age>=30){
            this.age = 18;
        }
        else
        this.age = age;




    }
}
