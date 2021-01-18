package com.Flonx.TestClass;

/**
 * @Auther:Flonx
 * @Date:2021/1/18 - 01 - 18 - 8:54
 * @Description: com.Flonx.TestClass
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        create a specific Boy class's object
        Boy boy = new Boy(30,"鹿晗");
        Girl girl = new Girl("关晓彤",100);

        girl.love(boy);
        girl.weChat();
//        面向对象的思维:找参与者,找女孩类,男孩类
//       体会了什么叫方法的实参,方法的形参
//        具体传入的内容:实参

//        类和类之间可以产生关系:
//        将一个类作为另一个类中的方法的形参
//       将一个类作为另一个类的属性
    }
}
