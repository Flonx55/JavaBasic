import java.util.Scanner;

public class IndexCalculation
{
	public static void main(String[] args)
	{
		//有一对兔子,从出生后第三个月起每个月都生一对兔子,
		//小兔子长到第三个月后每个月有生一对兔子,假如兔子都不死,问每个月的兔子对数为多少?
		
		int n = 10;
		System.out.println("第"+n+"个月兔子总数为"+fun(n));
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份:");
		
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
	//一月份:1
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