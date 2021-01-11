package Flonx8;

/**
 * @Auther:Flonx
 * @Date:2021/1/11 - 01 - 11 - 20:22
 * @Description: Flonx8
 * @Version: 1.0
 */
public class Student {
//    properties
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")){
            this.sex = sex;
        }else{
            this.sex = "男";
        }
    }
    public Student(){

    }
    public Student (int age,String name,String sex){
        this.age = age;
        this.name = name;
        this.setSex(sex);

    }
}
