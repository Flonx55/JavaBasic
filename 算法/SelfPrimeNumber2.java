public class SelfPrimeNumber2
{
	public static void main(String[] args)
	{
		int m = 1;
		int n = 1000;
		int count = 0;
		
		for(int i = m;i<n;i++)
		{
			if(isPrime(i))
			{
				count++;
				System.out.print(i+" ");
				if(count % 10 == 0)
				{
					System.out.println();
				}
			}
		}
		
	}
	private static boolean isPrime(int num)
	{
		int flag = true;
		if(num==1)
		{
			flag == false;
		}
		else
		{
			for(int i = 1;i<=Math.sqrt(num);i++)
			{
				if(num%i==0||num == 1)
				{
					flag = false;
					break;
				}
				else
					flag = true;
			}
		}
		return flag;
	}
}