import java.util.Scanner;
public class TestOpe02
{
	public static void main(String[] args)
	{
		//ʵ�ֹ���:�������һ����λ��,���ÿλ�ϵ����ֲ����
		
		//1.�������һ����λ��
		Scanner input = new Scanner(System.in);
		System.out.println("��¼��һ����λ��:");
		int num = input.nextInt();
		
		//2.���ÿλ�ϵ�����
		//��λ��
		int num1 = num%10;
		//ʮλ��
		int num2 = num/10%10;
		//��λ��
		int num3 = num/100%10;
		//ǧλ��
		int num4 = num/1000;
		
		//3.���ÿλ�ϵ�����
		System.out.println("��λ�ϵ���Ϊ:"+num1);
		System.out.println("ʮλ�ϵ���Ϊ:"+num2);
		System.out.println("��λ�ϵ���Ϊ:"+num3);
		System.out.println("ǧλ�ϵ���Ϊ:"+num4);
		
	}
}