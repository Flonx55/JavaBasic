public class TestFor14
{
	public static void main(String[] args)
	{
		//先打印出来一个正方形,然后某些位置上打印*
		//某些位置上打印空格
		
		int size = 17;
		int startNum = size/2+1;//起始列号
		int endNum = size/2+1;//结束列号
		boolean flag = true;
		
		for(int i = 1;i <= size;i ++)
		{
			for(int j = 1;j <= size;j ++)
			{
				// if(j>=startNum&&j<=endNum)
				// {
					// System.out.print("*");
				// }
				//实心
				
				if(j == startNum|| j == endNum)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(endNum == size)
			{
				flag = false;
			}
			if(flag)//flag 是true相当于在菱形的上半侧
			{
				startNum --;
				endNum ++;
			}
			else
			{
				startNum ++;
				endNum --;
			}
		}
	}
}
