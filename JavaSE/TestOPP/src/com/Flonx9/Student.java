package com.Flonx9;

/**
 * @Auther:Flonx
 * @Date:2021/1/14 - 01 - 14 - 19:10
 * @Description: com.Flonx9
 * @Version: 1.0
 */
public class Student extends Person{
//    properties:
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //methods
    public void study(){
        System.out.println("study...");
    }
}
