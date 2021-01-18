package com.Flonx.TestToString;

/**
 * @Auther:Flonx
 * @Date:2021/1/17 - 01 - 17 - 8:22
 * @Description: com.Flonx.TestToString
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("Flonx",18,180);
//        System.out.println(stu1.getName());
//        System.out.println(stu1.getAge());
//        System.out.println(stu1.getHeight());
        System.out.println(stu1);
        System.out.println(stu1.toString());

//        toString method's function:
//        hashCode:将对象在堆中的地址进行哈希算法,返回一个码,哈希码,
//        将这个哈希码传入到Integer.toHexString(哈希码)中,返回一个字符串
//        这个字符串是一个十六进制数对应的字符串
//        现在,使用toString方法的时候,打印出来的东西不好看,对于其他人来说不友好,可读性不好
//        子类对父类提供的toString方法不满意---->对toString方法进行重写
    }
}
