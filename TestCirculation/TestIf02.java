import java.util.Scanner;

public class TestIf02
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员积分: ");
		//要判断积分是不是int类型的
		
		//先判断键盘录入的数据是不是int类型的
		if(input.hasNextInt() == true)
		{
			
			double discount = 0;
			int score = input.nextInt();
			//要判断积分是不是正数
			if(score>0)
			{
					if(score>=8000)
				{
					discount = 0.6;
				}
				else if(score>=4000)
				{
					discount = 0.7;
				}
				else if(score>=2000)
				{
					discount = 0.8;
				}
				else
				{
					discount = 0.9;
				}
				System.out.println("该会员享受的折扣是: "+discount);
				
			}
			else
			{
				System.out.println("您输入的不是正数!");
			}
		}
		else
		{
			System.out.println("您输入的值格式不正确!");
			
		}
		
		
		
		
	}
}