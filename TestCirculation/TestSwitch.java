import java.util.Scanner;

public class TestSwitch
{
	public static void main(String[] args)
	{
		/*
		实现一个功能:
		根据给出的学生分数,判断学生的等级
		>=90---------------A
		>=80---------------B
		>=70---------------C
		>=60---------------D
		<60-----------------E
		*/
		
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("请输入你的成绩:");
			int score = input.nextInt();
			switch(score/10)//支持类型:int		byte	    short	   char	 String	枚举
			{
				case 10:
				case 9:System.out.println('A');
					break;
				case 8:System.out.println('B');
					break;
				case 7:System.out.println('C');
					break;
				case 6:System.out.println('D');
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:System.out.println('E');
					break;
				default:System.out.println("输入值错误!");//default分支可以写在任意位置上,但是如果没有在最后一行,后面必须加上break关键字
					break;											  //如果在最后一行的话,break可以省略
			}
		}
		catch(Exception ex)
		{
			System.out.println("输入错误");
		}
		
		
	}
}

//表达式是等值判断的话------>if,switch都可以
//如果表达式是区间判断的情况------>if最好