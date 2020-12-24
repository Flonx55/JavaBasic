public class TestFor05
{
	public static void main(String[] args)
	{/*
		for(int i = 1;i <= 100;i++)
		{
			while(i==36)
			{
				continue;//1~35+ËÀÑ­»·
			}
			System.out.println(i);
		}
		*/
		outer:
		for(int i = 1;i <= 100;i++)
		{
			while(i == 36)
			{
				continue outer;
			}
			System.out.println(i);
		}
	}
}