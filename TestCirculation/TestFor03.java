public class TestFor03
{
	public static void main(String[] args)
	{
		outer:			//------->�����ǩ������λ��
		for(int i = 1;i <= 100;i++)
		{
			System.out.println(i);
			while(i == 36)
			{
				break outer;
				
			}
			// if(i == 36)
			// {
				// break; 		//breakֹͣ����whileѭ��,�����������forѭ��
			// }
		}
	}
}
//������˳�����ѭ��,�ͽ�break����ǩ��ʹ��