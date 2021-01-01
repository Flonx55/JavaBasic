package com.Flonx;

/**
 * @Auther:Flonx
 * @Date:2020/12/31 - 12 - 31 - 17:37
 * @Description: com.Flonx
 * @Version: 1.0
 */
public class Student {
    int c;//member variable: In class ,outside the method
    short s;
    byte e;
    long num2;
    float f;
    double d;
    char ch;
    boolean bo;
    String name;
    public void study() {
        int num;//local variable: In methods,
//        System.out.println(num);---------->uninitialize]

//        int num;------>Duplicate named
        {
            int a;//local variable : In code blocks
        }
        if (1 == 3) {
            int b;//local variable
        }
        System.out.println(c);
    }

    public void eat() {
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.bo);
        System.out.println(s.ch);
        System.out.println(s.d);
        System.out.println(s.e);
        System.out.println(s.f);
        System.out.println(s.name);
        System.out.println(s.num2);
        System.out.println(s.s);
    }
}
