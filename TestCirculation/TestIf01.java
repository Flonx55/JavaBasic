
public class TestIf01
{
	public static void main(String[] args)
	{
		//实现一个功能:随机给出三个数(1-6),对三个数进行求和运算,根据和的大小来分配不同的奖品.
		//如果和大于等于14,那么一定就是一等奖
		
		int num1 = (int)(Math.random()*57)+36;//[36,92]--->[0,56]+36
		int num2 = (int)(Math.random()*7);
		int num3 = (int )(Math.random()*7);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		// int num1 = 6;
		// int num2 = 6;
		// int num3 = 6;
		//int sum = 0;
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		System.out.println(sum);
		
		if(sum>=14)
		{
			System.out.println("一等奖");
		}
		else if(sum>=10)
		{
			System.out.println("二等奖");
		}
		else if(sum>=6)
		{
			System.out.println("三等奖");
		}
		else
		{
			System.out.println("四等奖");
		}
		
	}
}