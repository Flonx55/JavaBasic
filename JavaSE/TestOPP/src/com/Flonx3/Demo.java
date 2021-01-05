package com.Flonx3;

/**
 * @Auther:Flonx
 * @Date:2021/1/4 - 01 - 04 - 18:38
 * @Description: com.Flonx3
 * @Version: 1.0
 */
public class Demo {
    int id;
    static int sid;

    public void a(){
        System.out.println(sid);
        System.out.println(id);
        System.out.println("------a");
    }
    //static and public both are modifiers,paratactic  in no order
    public static void b(){
        System.out.println(sid);
//        System.out.println(id);
//        Non-static properties cannot be accessed in static methods
        System.out.println("-------b");
//        a();
//        Non-static methods cannot be accessed in static methods
    }
    public static void main(String[] args){
        Demo d = new Demo();
        d.a();
        Demo.b();
    }
}
