import java.util.Scanner;

public class TestIf02
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա����: ");
		//Ҫ�жϻ����ǲ���int���͵�
		
		//���жϼ���¼��������ǲ���int���͵�
		if(input.hasNextInt() == true)
		{
			
			double discount = 0;
			int score = input.nextInt();
			//Ҫ�жϻ����ǲ�������
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
				System.out.println("�û�Ա���ܵ��ۿ���: "+discount);
				
			}
			else
			{
				System.out.println("������Ĳ�������!");
			}
		}
		else
		{
			System.out.println("�������ֵ��ʽ����ȷ!");
			
		}
		
		
		
		
	}
}