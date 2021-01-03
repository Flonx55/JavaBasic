package com.Flonx3;

/**
 * @Auther:Flonx
 * @Date:2021/1/3 - 01 - 03 - 19:30
 * @Description: com.Flonx3
 * @Version: 1.0
 */
public class Test {
    //property
    int id;
    static int sid;

    public static void main(String[] args) {
//        create a specific object of Test Class
        Test t1 = new Test();
        t1.id = 10;
        t1.sid = 10;

        Test t2 = new Test();
        t2.id = 20;
        t2.sid = 20;

        Test t3 = new Test();
        t3.id = 30;
        t3.sid = 30;

        //Read the value of properties
        System.out.println(t1.id);
        System.out.println(t2.id);
        System.out.println(t3.id);

        System.out.println(t1.sid);
        System.out.println(t2.sid);
        System.out.println(t3.sid);
    }
}
