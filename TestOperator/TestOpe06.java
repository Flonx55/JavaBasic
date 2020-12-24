import java.util.Scanner;

public class TestOpe06
{
	public static void main(String[] args)
	{
		//要任意给出两个数,交换两个数并输出
		//1.给出两个数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入num1:");
		int num1 = input.nextInt();
		System.out.print("请输入num2:");
		int num2 =input.nextlnt();
		//2.输出交换前的两个数
		System.out.println("num1交换前:"+num1);
		System.out.println("num2交换前:"+num2);
		//3.交换
		num1 = num1 - num2;//10 - 20 == -10
		num2 = num1+ num2; //-10 + 20 == 10
		num1 = num2 - num1;//10 - -10 == 20
		//4.输出交换后的两个数
		System.out.println("num1交换后:"+num1);
		System.out.println("num2交换后:"+num2);
	}

}