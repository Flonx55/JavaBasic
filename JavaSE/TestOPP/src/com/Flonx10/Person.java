package com.Flonx10;

/**
 * @Auther:Flonx
 * @Date:2021/1/15 - 01 - 15 - 8:19
 * @Description: com.Flonx10
 * @Version: 1.0
 */
public class Person {
    public Person eat(){
        System.out.println("eat food");
        return new Person();
    }
    public void sleep(){
        System.out.println("sleep");
    }

}
