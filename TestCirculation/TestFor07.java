import java.util.Scanner;
public class TestFor07
{
	public static void main(String[] args)
	{
		/*
			实现一个功能:
			[1]请录入10个整数,当输入的数是666的时候,退出程序
			[2]判断其中录入整数的个数并输出
			[3]判断系统的退出状态:是正常退出还是被迫退出
		*/
		boolean b = true;
		try
		{
			Scanner input = new Scanner(System.in);
			for(int i = 1;i<=10;i++)
			{
				System.out.println("请输入第"+i+"个整数");
				int num = input.nextInt();
				
				if(num == 666)
				{
					b = false;
					System.out.println("已录入的个数为:"+(i-1));
					break ;
				}
			}
			if(b == true)
			{
				System.out.println("正常退出");
			}
			else
			{
				System.out.println("被迫退出");
			}
		}
		catch(Exception ex)
		{
			System.out.println("输入错误!");
		}
	}
}