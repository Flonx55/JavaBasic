import java.util.Scanner;
public class TestFor09
{
	public static void main(String[] args)
	{
		/*
			长方形:
			********
			********
			********
		
		*/
		
		//平行四边形
		
		for(int i = 0;i<3;i++)
		{
			for(int m = i;m<8;m++)
			{
				System.out.print(" ");
			}
		
			for(int m = 0;m<8;m++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		//三角形
		Scanner input = new Scanner (System.in);
		System.out.println("请输入列数:");
		int num = input.nextInt();
		for(int i = 0;i<num;i++)
		{
			for(int j = 1+i;j <=(2*num-1);j++)
			{
				System.out.print(" ");
			}
			// for(int j = 6-i;j>=i;j--)
			// {
				// System.out.print("*");
			// }
			int k = 1;
			while(k<=(2*i+1))
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
		
		//菱形
		int num2 = input.nextInt();
		for(int i = 0;i<num2;i++)//行数
		{
			for(int j = i;j<num2;j++)//空格数
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}