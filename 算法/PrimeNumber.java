public class PrimeNumber
{
	public static void main(String[] args)
	{


		for(int i = 101;i < 201;i++)
		{
			boolean b = true;
			for(int j = 2;j<i/2+1;j++)
			{
				if(i%j ==0)
				{
					b = false;
					break;
				}
					
			}
			if(b ==true)
			{
				System.out.println(i);
			}
		}
		
	}
}