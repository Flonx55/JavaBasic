package com.calculator;


import java.text.DecimalFormat;
import java.util.Scanner;//import �Ǵӱ�İ�������

public class BodyMassIndexCalcutor {
	
	String name = "Flonx";
	
	public static void main(String[] args) 
	{
	
		final String welcomeMsg = "��ӭʹ���ҵ�BMI���ؼ�����,�˳�����������-1";
		System.out.println(welcomeMsg);
		
		String name = "Xander";//�ֲ��������ȼ�����ȫ�ֱ���
		System.out.println(name);
		double height = 1.0;
		double weight = 50;
		
		//ɨ����,���Խ����û�������
		//new�Ǵ�������ʵ��
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("�������������");
		height = sc.nextDouble();
		if(height == -1)
		{
			System.out.println("���������˳�,��ӭ�´�ʹ��");
			break;
		}
		System.out.println("��������������");
		weight = sc.nextDouble();
		if(weight == -1)
		{
			System.out.println("���������˳�,��ӭ�´�ʹ��");
			break;
		}	
		double bmi = weight /(height*height);
		
		DecimalFormat df = new DecimalFormat("#.0");//��������Pasical������,������Camel������//ctrl +shift+o �Զ�import
		
		System.out.println("����BMIֵ��:"+ df.format(bmi));
		
		if(bmi <18.5) 
		{
			System.out.println("���ƫ��,��Ե�");
		}
		else if(bmi<=23.9) 
		{
			System.out.println("�������,��������");
		}
		else
		{
			System.out.println("���ƫ��,�ٳԵ�");
		}
		
		//learnSwitch();
		}
		//sc.close();
	}
	
	
	
	//����switch
	static void learnSwitch()
	{
		int weekday = 3;
		String weekDayStr;
		
		//��Ҫ��break,�����ͷ��β��һֱִ��,ֱ������breakΪֹ
		//�������Լ�default,�����������ж�,����ֱ���߳�ȥ
		//��ֻ֧�����¼�������,int	byte	short	 char String	Enum	 Integer	Byte 	Short	 	Character
		//���ڷ�֧�Ƚ϶��ʱ��,����ʹ��
		
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
