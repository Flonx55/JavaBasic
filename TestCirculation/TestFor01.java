public class TestFor01
{
	public static void main(String[] args)
	{
		//1+2+3+...+100
		
		
		//while:
		// int i = 1;
		// int sum = 0;
		// while(i <= 100)
		// {
			// sum +=i;
			// i ++;
		// }
		// System.out.println(sum);
		
		//for
		 int sum = 0;
		for(int i = 1;i<100;i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
/*
	[1] i ��������:�����Լ�ȥ����,
	[2]for(;;){}	---->��ѭ��
	[3]forѭ����ʽ�ر����:��ʽ��Ȼ�����,���������Լ�д�����ʱ�򲻽��������д
	int i = 1;
	for(;i <= 100;)
	{
		sum +=i;
		i ++;
	}
	[4]��ѭ��:
		for(;;){}
		
		while(true){}
		
		do
		{
			
		}while(true);
		
	[5]ѭ����Ϊ������:
		��һ��:����--------------forѭ��,whileѭ��
		�ڶ���:ֱ����----------do-whileѭ��
	
	[6]�Ժ���:forѭ��
	[7]do-while,while,forѭ��˭��Ч�ʸ�?		һ����
	
*/
