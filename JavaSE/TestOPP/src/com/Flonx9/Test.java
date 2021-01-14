package com.Flonx9;

/**
 * @Auther:Flonx
 * @Date:2021/1/14 - 01 - 14 - 19:13
 * @Description: com.Flonx9
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        //    create a Student class
        Student stu1 = new Student();
        stu1.setSno(1001);
        stu1.setAge(18);
        stu1.setHeight(180.0);
        stu1.setName("Flonx");

        System.out.println("This guy's name is:"+ stu1.getName()+","+"His age is :"+stu1.getAge());

        stu1.study();
        stu1.eat();
        stu1.sleep();
    }

}
