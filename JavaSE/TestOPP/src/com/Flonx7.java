package com;

import com.Flonx6.Girl;

/**
 * @Auther:Flonx
 * @Date:2021/1/9 - 01 - 09 - 21:10
 * @Description: com
 * @Version: 1.0
 */
public class Flonx7 {
    public static void main(String[] args) {
//       提高代码的安全性
        Girl g = new Girl();
//        g.age = 33;
//        System.out.println(g.age);
        g.setAge(31);//设置年龄
        System.out.println(g.readAge());//读取年龄


    }
}
