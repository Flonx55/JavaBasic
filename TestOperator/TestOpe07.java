import java.util.Scanner;

public class TestOpe07
{
	public static void main(String[] args)
	{
		//ʵ�ֹ���:����������,���
		//1.����������
		Scanner input = new Scanner(System.in);
		System.out.println("������������:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		//2.���
		//����һ������,�������պ�
		double sum = 0;
		sum = sum+num1;//��Ч:	sum += num1
		sum = sum+num2;//			sum +=num2
		sum = sum+num3;//			sum +=num3
		//double sum = num1+ num2 + num3;
		
		//3.�������
		
		System.out.println(sum);
		System.out.println((num1<num2)?num3:0);
	}
}
