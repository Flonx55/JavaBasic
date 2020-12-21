class LearnRecursion
{
	public static void main(String[] args)
	{
		//tellStory(10);
		//System.out.println(jiecheng(5));
		System.out.println(fib(10));
		
	}
	
	 static void tellStory(int storyCount)
	{
		if(storyCount == 0)
		{
		System.out.println("讲完收工");
		return;
		}
		System.out.println("第"+storyCount+"个故事");
		System.out.println("从前有座山");
		System.out.println("山里有座庙");
		System.out.println("庙里有个老和尚讲故事");
		System.out.println("讲的什么呢?");
		
		tellStory(storyCount-1);
		
	}
	static long jiecheng(int num)
	{
		if(num==1)
			return 1;
		else
			return num*jiecheng(num-1);
		
	}
	//斐波那契数列
	static long fib(int num)
	{
		if(num == 1)
			return 1;
		if(num == 2)
			return 1;
		
		return fib(num-1)+fib(num-2);
	}	
	//青蛙跳台阶 -n台阶,青蛙从地面跳台阶,可以一次
	//跳1个台阶,也可以一次跳两个台阶
	//求一共有多少种跳法
	static long fogJump(int num)
	{
		if(num == 1) return 1;
		if(num == 2) return 2;
		
		return fogJump(num)+fogJump(num-1);
	}
		
}