public class TestDoWhile
{
	public static void main(String[] args)
	{
		//1+2+3+4+...+100
		//while��ʽ
		
		int i = 101;
		int sum = 0;
		while(i<=100)
		{
			sum +=i;
			i++;
		}
		System.out.println(i);
		System.out.println(sum);
		
		//do-while��ʽ
		do
		{
			sum += i;
			i++;
		}while(i <= 100);//ע��д�ֺ�,����������
		System.out.println(i);
		System.out.println(sum);
	
	}
}
/*
	[1]while��do-while������:
		while:���ж�,��ִ��
		do-while:��ִ��,���ж�------->���ٱ�ִ��һ��,�ӵڶ��ο�ʼ�ſ�ʼ�ж�
	[2]ʲô����ʹ��do-while:
		
*/