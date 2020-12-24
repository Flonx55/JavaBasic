import java.util.Scanner;

public class TestIf03
{
	public static void main(String[] args)
	{
		//小朋友搬桌子:
		//年龄大于7岁,可以搬桌子;
		//如果年龄大于5岁,性别是男,可以搬桌子
		//否则不可以搬动桌子
		
		System.out.println("请输入你的年龄:");
		Scanner ageInput = new Scanner(System.in);
		
		if(ageInput.hasNextInt() == true)
		{
			int age = ageInput.nextInt();
			if(age>7)
			{
				System.out.println("可以搬桌子");
			}
			else if(age>5)
			{
				System.out.println("请输入你的性别:");
				//Scanner genderInput = new Scanner(System.in);	//false
				// char s = ageInput.next().charAt(0);
				
				// if(s =='男')
				// {
					// System.out.println("可以搬桌子");
				// }
				// else if(s =='女')
				// {
					// System.out.println("不可以搬桌子");
				// }
				// else
				// {
					// System.out.println("性别输入错误");
				// }
				
				
				//用char代替string去接收可以正常比较
				
				String s = ageInput.next();
				
				if(s =="男")
				{
					System.out.println("可以搬桌子");
					
				}
				else if(s =="女")
				{
					System.out.println("不可以搬桌子");
				}
				else
				{
					System.out.println("性别输入错误");
				}
				System.out.println(s);
				
				
				//回车也会被读入,所以始终不等于该字符
				//就算在字符串中加入\n,也不能代替回车
			}
			else
			{
				System.out.println("不可以搬桌子");
			}
			
		}
		else
		{
			System.out.println("输入错误");
		}
	}
}