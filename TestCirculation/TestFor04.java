public class TestFor04
{
	public static void main(String[] args)
	{
		//Fuction:输出1~100中被6整除的数
		for(int i = 1;i<=100;i++)
		{
			// if(i%6==0)
			// {
				// System.out.println(i);
			// }
			
			if(i%6 != 0)
			{
				continue;//停止本次离他近的循环,继续进行下一次循环
			}
			System.out.println(i);
		}
	}
}
