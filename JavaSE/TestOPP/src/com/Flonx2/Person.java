package com.Flonx2;

import java.nio.channels.Pipe;

/**
 * @Auther:Flonx
 * @Date:2020/12/31 - 12 - 31 - 18:50
 * @Description: com.Flonx2
 * @Version: 1.0
 */
public class Person {

    public Person(){
//        age = 19;
//        name = "lili";
//        height = 169.5;
    }
    public Person(String name,int age ,double height){
//        principle of proximity will appear when the parameter's name and assignment's name are same
//        use "this" to avoid this problem
        this.name = name;
        this.age = age;
        this.height = height;
    }
//      property:
    String name;
    int age;
    double height;
//    method
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
