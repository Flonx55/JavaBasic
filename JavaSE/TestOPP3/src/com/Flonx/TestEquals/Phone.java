package com.Flonx.TestEquals;

/**
 * @Auther:Flonx
 * @Date:2021/1/17 - 01 - 17 - 9:06
 * @Description: com.Flonx.TestEquals
 * @Version: 1.0
 */
public class Phone {
    private String brand;
    private double price;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone(){

    }

    public Phone (String brand,double price,int year){
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public boolean equals (Object obj) {
//        将obj转为Phone类型
        if (obj instanceof Phone) {//判断a对象是否是b类的实例,如果是,返回true,如果不是,返回false
            Phone other = (Phone) obj;
            if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice() && this.getYear() == this.getYear())
                return true;
            return false;
        }
        return false;
    }

}
