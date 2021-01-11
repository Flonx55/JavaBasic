package Flonx8;

/**
 * @Auther:Flonx
 * @Date:2021/1/11 - 01 - 11 - 20:23
 * @Description: Flonx8
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        create a Student class
        Student stu1 = new Student();
        stu1.setName("nana");
        stu1.setAge(19);
        stu1.setSex("女");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getSex());

        Student stu2 = new Student(18,"Flonx","男");
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getSex());

    }
}
