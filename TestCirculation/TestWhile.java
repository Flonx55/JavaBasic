public class TestWhile
{
	public static void main(String[] args)
	{
		//Fuction:1+2+3+4
		int i = 100;
		int sum = 0;
		while(i>0)
		{
			sum += i--;
		}
		System.out.println(sum);
		//Function:1+...+1000
		i = 1000;
		sum = 0;
		while(i>0)
		{
			sum +=i;
			i -= 2;
		}
		System.out.println(sum);
		//Function:5+10+...+100
		i = 100;
		sum = 0;
		while(i>0)
		{
			sum +=i;
			i -=5;
		}
		System.out.println(sum);
		//Function:1*3*5*...13
		i = 13;
		sum = 1;
		while(i>0)
		{
			sum *=i;
			i -=2;
		}
		System.out.println(sum);
		//Function:1+3+5+...+99
		i = 1;
		sum = 0;
		while(i<=99)
		{
			sum +=i;
			i +=2;
		}
		System.out.println(sum);
		
	}
}
//[1]ѭ������:�����ִ����ظ�ִ��.
//	ѭ��ֻ������˳���Ա��д�����Ч��,���ǵײ�ִ�е�ʱ����Ȼ���ظ�ִ��.
//[2]ѭ����Ҫ��:������ʼ��,�����ж�,ѭ����,����

//��ʼ��˭,���ж�˭,�ж�˭,�͵���˭