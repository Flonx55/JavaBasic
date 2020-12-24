public class TestFor03
{
	public static void main(String[] args)
	{
		outer:			//------->定义标签结束的位置
		for(int i = 1;i <= 100;i++)
		{
			System.out.println(i);
			while(i == 36)
			{
				break outer;
				
			}
			// if(i == 36)
			// {
				// break; 		//break停止的是while循环,而不是外面的for循环
			// }
		}
	}
}
//如果想退出外层的循环,就将break带标签地使用