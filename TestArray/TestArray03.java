import java.util.Scanner;

public class TestArray03
{
	/*静态初始化*/
	/*除了用new关键字来产生数组以外,还可以直接在定义数组的同时就为数组元素分配空间并赋值*/
	int[] arr = {12,23,45};
	
	/*
	eg:
		1  int[] arr = new int[3]{12,23,45};----->错误
		2  int[] arr;
		   arr = {12,23,45};----->错误
	*/
	
	
	/*动态初始化*/
	/*数组定义与为数组元素分配空间并赋值的操作分开进行*/
	
	int[] arr;
	arr = new int[3];-------->正确
	arr[0] = 12;
	arr[1] = 23;
	arr[2] = 45;
	
	
	/*默认初始化*/
	/*数组是引用类型,它的元素相当于类的实例变量,因此数组一经分配空间,
	其中的每个元素也被按照实例变量同样的方式被隐式初始化*/
	Int[] arr = new int[3]; /*数组有默认的初始化值*/
}