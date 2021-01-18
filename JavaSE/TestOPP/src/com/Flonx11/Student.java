package com.Flonx11;

/**
 * @Auther:Flonx
 * @Date:2021/1/15 - 01 - 15 - 8:46
 * @Description: com.Flonx11
 * @Version: 1.0
 */
public class Student extends  Person {
    double score;
    int age = 20;

    public Student(){

    }
    public Student(double score) {
        this.score = score;

    }
    public Student(int age,String name,double score){
//        super(age,name);
//        super.age = age;
//        super.name = name;
        super(age,name);
//        this(score);
        this.score = score;
    }

    public void study(){
        System.out.println("study");
    }
    public void a(){
        System.out.println(super.age);
        eat();
        this.eat();
        super.eat();
    }




}
