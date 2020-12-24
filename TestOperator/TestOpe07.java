import java.util.Scanner;

public class TestOpe07
{
	public static void main(String[] args)
	{
		//实现功能:给出三个数,求和
		//1.给出三个数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个数:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		//2.求和
		//定义一个变量,用来接收和
		double sum = 0;
		sum = sum+num1;//等效:	sum += num1
		sum = sum+num2;//			sum +=num2
		sum = sum+num3;//			sum +=num3
		//double sum = num1+ num2 + num3;
		
		//3.将和输出
		
		System.out.println(sum);
		System.out.println((num1<num2)?num3:0);
	}
}
