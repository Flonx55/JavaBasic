import java.util.Scanner;
public class TestFor07
{
	public static void main(String[] args)
	{
		/*
			ʵ��һ������:
			[1]��¼��10������,�����������666��ʱ��,�˳�����
			[2]�ж�����¼�������ĸ��������
			[3]�ж�ϵͳ���˳�״̬:�������˳����Ǳ����˳�
		*/
		boolean b = true;
		try
		{
			Scanner input = new Scanner(System.in);
			for(int i = 1;i<=10;i++)
			{
				System.out.println("�������"+i+"������");
				int num = input.nextInt();
				
				if(num == 666)
				{
					b = false;
					System.out.println("��¼��ĸ���Ϊ:"+(i-1));
					break ;
				}
			}
			if(b == true)
			{
				System.out.println("�����˳�");
			}
			else
			{
				System.out.println("�����˳�");
			}
		}
		catch(Exception ex)
		{
			System.out.println("�������!");
		}
	}
}