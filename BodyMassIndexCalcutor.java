package com.calculator;


import java.text.DecimalFormat;
import java.util.Scanner;//import 是从别的包引入类

public class BodyMassIndexCalcutor {
	
	String name = "Flonx";
	
	public static void main(String[] args) 
	{
	
		final String welcomeMsg = "欢迎使用我的BMI体重计算器,退出程序请输入-1";
		System.out.println(welcomeMsg);
		
		String name = "Xander";//局部变量优先级高于全局变量
		System.out.println(name);
		double height = 1.0;
		double weight = 50;
		
		//扫描仪,可以接受用户的输入
		//new是创建对象即实例
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("请输入您的身高");
		height = sc.nextDouble();
		if(height == -1)
		{
			System.out.println("程序正在退出,欢迎下次使用");
			break;
		}
		System.out.println("请输入您的体重");
		weight = sc.nextDouble();
		if(weight == -1)
		{
			System.out.println("程序正在退出,欢迎下次使用");
			break;
		}	
		double bmi = weight /(height*height);
		
		DecimalFormat df = new DecimalFormat("#.0");//类名都是Pasical命名法,方法用Camel命名法//ctrl +shift+o 自动import
		
		System.out.println("您的BMI值是:"+ df.format(bmi));
		
		if(bmi <18.5) 
		{
			System.out.println("身材偏瘦,多吃点");
		}
		else if(bmi<=23.9) 
		{
			System.out.println("身材完美,继续保持");
		}
		else
		{
			System.out.println("身材偏胖,少吃点");
		}
		
		//learnSwitch();
		}
		//sc.close();
	}
	
	
	
	//介绍switch
	static void learnSwitch()
	{
		int weekday = 3;
		String weekDayStr;
		
		//☆要加break,否则从头到尾会一直执行,直到遇到break为止
		//☆最后可以加default,不进行条件判断,可以直接走出去
		//☆只支持以下几种类型,int	byte	short	 char String	Enum	 Integer	Byte 	Short	 	Character
		//☆在分支比较多的时候,优先使用
		
		switch(weekday)
		{
		case 1:weekDayStr = "Monday";
				break;
		case 2:weekDayStr = "Tuesday";
				break;
		case 3:weekDayStr = "Wednesday";
				break;
		case 4:weekDayStr = "Thursday";
				break;
		case 5:weekDayStr = "Friday";
				break;
		case 6:weekDayStr = "Saturday";
				break;
		case 7:weekDayStr = "Sunday";
				break;
				default:weekDayStr = null;
				
		}
		System.out.println(weekDayStr);
	}
			

}
