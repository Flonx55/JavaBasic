public class TestFor02
{
	public static void main(String[] args)
	{
		//功能:求1~100的和,当和第一次超过300的时候,停止程序
		
		int sum = 0;
		for(int i = 1;i <= 100;i++)
		{
			sum += i;
			if(sum > 300)
			{
				break;
			}
		}
		System.out.println(sum);
	}
}