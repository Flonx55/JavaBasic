import java.util.Scanner;

public class TestIf03
{
	public static void main(String[] args)
	{
		//С���Ѱ�����:
		//�������7��,���԰�����;
		//����������5��,�Ա�����,���԰�����
		//���򲻿��԰ᶯ����
		
		System.out.println("�������������:");
		Scanner ageInput = new Scanner(System.in);
		
		if(ageInput.hasNextInt() == true)
		{
			int age = ageInput.nextInt();
			if(age>7)
			{
				System.out.println("���԰�����");
			}
			else if(age>5)
			{
				System.out.println("����������Ա�:");
				//Scanner genderInput = new Scanner(System.in);	//false
				// char s = ageInput.next().charAt(0);
				
				// if(s =='��')
				// {
					// System.out.println("���԰�����");
				// }
				// else if(s =='Ů')
				// {
					// System.out.println("�����԰�����");
				// }
				// else
				// {
					// System.out.println("�Ա��������");
				// }
				
				
				//��char����stringȥ���տ��������Ƚ�
				
				String s = ageInput.next();
				
				if(s =="��")
				{
					System.out.println("���԰�����");
					
				}
				else if(s =="Ů")
				{
					System.out.println("�����԰�����");
				}
				else
				{
					System.out.println("�Ա��������");
				}
				System.out.println(s);
				
				
				//�س�Ҳ�ᱻ����,����ʼ�ղ����ڸ��ַ�
				//�������ַ����м���\n,Ҳ���ܴ���س�
			}
			else
			{
				System.out.println("�����԰�����");
			}
			
		}
		else
		{
			System.out.println("�������");
		}
	}
}