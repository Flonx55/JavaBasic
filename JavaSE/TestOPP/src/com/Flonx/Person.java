package com.Flonx;

/**
 * @Auther:Flonx
 * @Date:2020/12/30 - 12 - 30 - 11:00
 * @Description: com.Flonx
 * @Version: 1.0
 */
public class Person {
    //名词:属性(我们只把有需要的内容写到代码里,不相关的东西不要放在代码中)
    int age;//member variable putted in the class
    String name;
    double height;
    double weight;


    public void eat(){
        int num = 0;//local variable putted in the method
        System.out.println("i like eating");
    }

    public void sleep(String address){
        System.out.println("i am sleeping in "+address);
    }
    //self-introduction
    public String introduce(){
        return "My name is "+name+".My age is "+age+".My height is "+height+".My weight is "+weight;
    }

    //动词:方法
}
