import java.util.Scanner;

public class SelfPrimeFactor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 2;i<num;i++)
		{
			boolean b = true;
			if(num % i == 0)
			{
				System.out.print(i+" ");
			} 
		}
	}
}
