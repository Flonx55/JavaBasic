
public class TestIf01
{
	public static void main(String[] args)
	{
		//ʵ��һ������:�������������(1-6),�������������������,���ݺ͵Ĵ�С�����䲻ͬ�Ľ�Ʒ.
		//����ʹ��ڵ���14,��ôһ������һ�Ƚ�
		
		int num1 = (int)(Math.random()*57)+36;//[36,92]--->[0,56]+36
		int num2 = (int)(Math.random()*7);
		int num3 = (int )(Math.random()*7);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		// int num1 = 6;
		// int num2 = 6;
		// int num3 = 6;
		//int sum = 0;
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		System.out.println(sum);
		
		if(sum>=14)
		{
			System.out.println("һ�Ƚ�");
		}
		else if(sum>=10)
		{
			System.out.println("���Ƚ�");
		}
		else if(sum>=6)
		{
			System.out.println("���Ƚ�");
		}
		else
		{
			System.out.println("�ĵȽ�");
		}
		
	}
}