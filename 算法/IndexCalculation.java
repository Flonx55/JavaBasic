import java.util.Scanner;

public class IndexCalculation
{
	public static void main(String[] args)
	{
		//��һ������,�ӳ��������������ÿ���¶���һ������,
		//С���ӳ����������º�ÿ��������һ������,�������Ӷ�����,��ÿ���µ����Ӷ���Ϊ����?
		
		int n = 10;
		System.out.println("��"+n+"������������Ϊ"+fun(n));
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������·�:");
		
		int parMonth = input.nextInt();
		System.out.println(getRabbits(parMonth/3));
		
		
	}
	private static int fun(int n)
	{
		if(n == 1|| n == 2)
			return 1;
		else
			return fun(n-1)+fun(n-2);
	}
	//һ�·�:1
	//3		2
	//6		2x3
	//9		6x3
	
	
	private static int getRabbits(int month)
	{
		
		if(month <=0)
			return 1;
		if(month == 1)
		{
			return 2;
		}
		else
		{
			return getRabbits(month-1)*3;
		}
		
		
	}
}