import java.util.Scanner;

public class TestSwitch
{
	public static void main(String[] args)
	{
		/*
		ʵ��һ������:
		���ݸ�����ѧ������,�ж�ѧ���ĵȼ�
		>=90---------------A
		>=80---------------B
		>=70---------------C
		>=60---------------D
		<60-----------------E
		*/
		
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("��������ĳɼ�:");
			int score = input.nextInt();
			switch(score/10)//֧������:int		byte	    short	   char	 String	ö��
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
				default:System.out.println("����ֵ����!");//default��֧����д������λ����,�������û�������һ��,����������break�ؼ���
					break;											  //��������һ�еĻ�,break����ʡ��
			}
		}
		catch(Exception ex)
		{
			System.out.println("�������");
		}
		
		
	}
}

//���ʽ�ǵ�ֵ�жϵĻ�------>if,switch������
//������ʽ�������жϵ����------>if���