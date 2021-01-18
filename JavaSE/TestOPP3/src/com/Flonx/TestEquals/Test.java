package com.Flonx.TestEquals;

/**
 * @Auther:Flonx
 * @Date:2021/1/17 - 01 - 17 - 9:09
 * @Description: com.Flonx.TestEquals
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("HuaWei",4999.99,2020);
        Phone p2 = new Phone("HuaWei",4999.99,2020);
        System.out.println(p1.getBrand() == p2.getBrand());//比较左右两侧的值是否相等
//对于引用数据类型来说,比较的是地址值,一定返回的是false
        System.out.println(p1.getBrand().equals(p2.getBrand()));//底层依旧比较的是==
        System.out.println(p1.equals(p2));
//        equals的作用:这个方法提供了对对象的内容是否相等的一个比较方式,对象的内容就是属性
//        父类的Object提供的equals就是在比较==地址,没有实际意义,我们一般不会直接使用父类提供的方法
//        而是在子类中对该方法进行重写

        Cat c = new Cat();
        System.out.println(p1.equals(c));

    }
}
