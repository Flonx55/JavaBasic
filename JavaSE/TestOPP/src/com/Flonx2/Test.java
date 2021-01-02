package com.Flonx2;

/**
 * @Auther:Flonx
 * @Date:2020/12/31 - 12 - 31 - 18:57
 * @Description: com.Flonx2
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        create a object/example/entity about Person class
//        the process of creating a object:
//        1.class loads the first time meeting the Person(only once)
//        2.create this object by create a space to it
//        3.initialize this object's properties

//           new keyword invokes a method actually,and this method is called Constructor
//           if your class haven't the constructor when invoking this constructor,
//        The System would distribute a constructor for you acquiescently
//        ,but you can't see it.
//           you can compile a constructor explicitly
//        Empty parameter constructor:no parameter's constructor


//        1.We should guarantee the existence of Empty Parameter Construction generally,
//        properties won't be assigned in it generally
//        2.We would overload  the Constructor commonly,and properties will be assigned in this overloaded constructor
//        3.If you haven't edit the Empty parameter Constructor after overloading the constructor ,
//        System also won't assign the default constructor.So if you invoke it ,the code will compile error

        Person p = new Person();
        p.age = 19;
        p.name = "lili";
        p.height = 180.4;
        Person p2 = new Person("lili",19,180.4);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);

//this
        //create a specific object
        TestThis testthis = new TestThis(19,"lili",160.6);
        testthis.eat();


    }
}
