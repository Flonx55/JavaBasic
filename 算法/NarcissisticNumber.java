public class NarcissisticNumber
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i = 100;i<1000;i++)
		{
			int unit = i%10;
			int tens = i/10%10;
			int hundreds = i/100;

			
			if(i == unit*unit*unit+tens*tens*tens+hundreds*hundreds*hundreds)
			{
				count ++;
				System.out.print(i+" ");
				if(count % 10 == 0)
				{
					System.out.println();
				}
			}

		}
	}
}