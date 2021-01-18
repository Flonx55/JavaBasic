package com.Flonx.TestClass;

/**
 * @Auther:Flonx
 * @Date:2021/1/18 - 01 - 18 - 8:50
 * @Description: com.Flonx.TestClass
 * @Version: 1.0
 */
public class Girl {
    String name;
    double weight;
    Mom mom;

    public Girl(String name, double weight) {//基本数据类型
        this.name = name;
        this.weight = weight;
        mom = new Mom();
    }

    public void love(Boy boy){//引用数据类型
        System.out.println("我男朋友的名字是:"+ boy.name+"我男朋友的年龄是:"+boy.age);
        boy.buy();
    }

    public void weChat(){
        mom.say();
    }
}
