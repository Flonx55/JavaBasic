import java.util.Scanner;

public class TestOpe06
{
	public static void main(String[] args)
	{
		//Ҫ�������������,���������������
		//1.����������
		Scanner input = new Scanner(System.in);
		System.out.print("������num1:");
		int num1 = input.nextInt();
		System.out.print("������num2:");
		int num2 =input.nextlnt();
		//2.�������ǰ��������
		System.out.println("num1����ǰ:"+num1);
		System.out.println("num2����ǰ:"+num2);
		//3.����
		num1 = num1 - num2;//10 - 20 == -10
		num2 = num1+ num2; //-10 + 20 == 10
		num1 = num2 - num1;//10 - -10 == 20
		//4.����������������
		System.out.println("num1������:"+num1);
		System.out.println("num2������:"+num2);
	}

}