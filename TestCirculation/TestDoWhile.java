public class TestDoWhile
{
	public static void main(String[] args)
	{
		//1+2+3+4+...+100
		//while方式
		
		int i = 101;
		int sum = 0;
		while(i<=100)
		{
			sum +=i;
			i++;
		}
		System.out.println(i);
		System.out.println(sum);
		
		//do-while方式
		do
		{
			sum += i;
			i++;
		}while(i <= 100);//注意写分号,否则编译出错
		System.out.println(i);
		System.out.println(sum);
	
	}
}
/*
	[1]while和do-while的区别:
		while:先判断,再执行
		do-while:先执行,再判断------->至少被执行一次,从第二次开始才开始判断
	[2]什么场合使用do-while:
		
*/