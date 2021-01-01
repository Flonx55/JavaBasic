package com.Flonx;

/**
 * @Auther:Flonx
 * @Date:2020/12/30 - 12 - 30 - 11:19
 * @Description: com.Flonx
 * @Version: 1.0
 */
public class Test {//This is a test class
    //This is a main method , the entrance of this program
    public static void main(String[] args) {
//    create a specific object of person
//    create  a object which name is "zs"
//        Person belongs to a reference data type
//        Class will be loaded the first time the class is loaded
//        this object's properties have default values
        Person zs = new Person();
        zs.name = "ZhangSan";
        zs.age = 18;
        zs.height = 178.5;
        zs.weight = 130;

//        Create another object
//        Class won't be load when creating another object,and class will be load only in the first time
        Person ls = new Person();
        ls.name = "LiSi";
        ls.age = 19;
        ls.height = 170.6;
        ls.weight = 160.5;

//        Read the value of  the property
        System.out.println(zs.name);
        System.out.println(ls.name);

//        Manipulate the method
//        Different objects have their own properties 's value,but their every method both are class's common method
//        properties:Properties of individual objects are independent
//        methods:methods of individual objects are shared
        zs.eat();
        ls.eat();
        zs.sleep("教室");
        String str = zs.introduce();
        System.out.println(str);
        System.out.println(zs.introduce());
    }
}
