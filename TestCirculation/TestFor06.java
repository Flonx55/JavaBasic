public class TestFor06
{
	public static void main(String[] args)
	{
		/*return:遇到return结束当前正在执行的方法
		
		for(int i = 1;i <= 100;i++)
		{
			while(i == 36)
			{
				return ;					//outer;不兼容标签
			}
			System.out.println(i);
		}
		
		*/
		
		
		//输出1~100中被5整除的数,每行输出6个
		int count = 0;
		for(int i = 5;i<= 100;i+=5)
		{
			System.out.print(i+"\t");
			count++;
			
			if(count % 6 == 0)
			{
				System.out.println();
			}
			
		}
	}
}