import java.util.Scanner;

public class PrimeFactor
{
	public static void main(String[] args)
	{
		//分解质因数
		int n = 18;
		decompose(n);
		
	}
	private static void decompose(int n)
	{
		System.out.print(n+"=");
		for(int i = 2;i<n+1;i++)
		{
			while(n%i==0&&n!=i)
			{
				n /= i;
				System.out.print(i+"*");
			}
			if(n==i)
			{
				System.out.println(i);
				break;
			}
		}
	}
}