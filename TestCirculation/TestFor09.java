import java.util.Scanner;
public class TestFor09
{
	public static void main(String[] args)
	{
		/*
			������:
			********
			********
			********
		
		*/
		
		//ƽ���ı���
		
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
		
		//������
		Scanner input = new Scanner (System.in);
		System.out.println("����������:");
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
		
		//����
		int num2 = input.nextInt();
		for(int i = 0;i<num2;i++)//����
		{
			for(int j = i;j<num2;j++)//�ո���
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