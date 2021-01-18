package com.Flonx10;

/**
 * @Auther:Flonx
 * @Date:2021/1/15 - 01 - 15 - 8:20
 * @Description: com.Flonx10
 * @Version: 1.0
 */
public class Student extends Person {
    public void study(){
        System.out.println("study");
    }
    public Student eat(){
        System.out.println("eat fast");
        return new Student();
    }

}
