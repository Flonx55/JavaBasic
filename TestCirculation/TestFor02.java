public class TestFor02
{
	public static void main(String[] args)
	{
		//����:��1~100�ĺ�,���͵�һ�γ���300��ʱ��,ֹͣ����
		
		int sum = 0;
		for(int i = 1;i <= 100;i++)
		{
			sum += i;
			if(sum > 300)
			{
				break;
			}
		}
		System.out.println(sum);
	}
}