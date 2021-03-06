package com.FLonx4;

import com.FLonx4.sub.subTest;

/**
 * @Auther:Flonx
 * @Date:2021/1/5 - 01 - 05 - 16:47
 * @Description: com.FLonx4
 * @Version: 1.0
 */
public class Test {
    //properties
    int a;
    static int sa;
    //methods
    public void a(){
        System.out.println("-------a");
        //普通块限制了局部变量的working range
        {
            System.out.println("-----this is a normal block");
            int num = 10;
            System.out.println(num);
        }
    }
    public static void b(){
        System.out.println("-------b");
    }
    //构造块
    {
        System.out.println("-------this is a construct block");
    }
    //static block
    static{
        System.out.println("-------this is a static block");
        //static properties and static methods can be accessed in the static blocks
        System.out.println(sa);
//        System.out.println(a);
    }
    //constructors
    public Test(int a){
        this.a = a;
    }
    public Test(){
        System.out.println("this is the empty parameter constructor");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.a();
        Test t2 = new Test();
        t2.a();
        new subTest();
    }
//代码块执行顺序:最先执行静态块,只在类加载的时候执行一次,
// 所以一般以后实战写项目:创建工厂,数据库的初始化信息都放入静态块
//    一般用于全局性的初始化操作

//    再执行构造块
//    再执行构造器
//    再执行普通块

//    包的作用:解决重名问题,解决权限问题
//    创建包
//    包名定义:
//    (1)名字全部小写
//    (2)中间用.
//    (3)一般都是公司域名倒着写
//    (4)加上模块名字
//    (5)不能使用系统中的关键字nul con com1---com9
//    (6)包声明的位置:一般都在非注释代码的第一行
//    没有包含与被包含的概念

}
