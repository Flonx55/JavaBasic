public class TestFor06
{
	public static void main(String[] args)
	{
		/*return:����return������ǰ����ִ�еķ���
		
		for(int i = 1;i <= 100;i++)
		{
			while(i == 36)
			{
				return ;					//outer;�����ݱ�ǩ
			}
			System.out.println(i);
		}
		
		*/
		
		
		//���1~100�б�5��������,ÿ�����6��
		int count = 0;
		for(int i = 5;i<= 100;i+=5)
		{
			System.out.print(i+"\t");
			count++;
			
			if(count % 6 == 0)
			{
				System.out.println();
			}
			
		}
	}
}