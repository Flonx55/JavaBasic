package Flonx5;

import com.FLonx4.sub.subTest;
import com.Flonx.Person;//导包,就是为了定位
import com.Flonx3.Demo;

import java.util.ArrayList;
import java.util.HashMap;

//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
import java.util.*;
/**
 * @Auther:Flonx
 * @Date:2021/1/7 - 01 - 07 - 20:22
 * @Description: Flonx5
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);//在导包以后,还想用其他包下同名的类,就必须手动自己写所在的包
        new Demo();
//        在java.lang包下的类,可以直接使用,无需导包
//        IDEA中打包的快捷键alt+enter,可以自动导包
        new ArrayList<>();
        new HashMap<>();
        new subTest();
    }
}
