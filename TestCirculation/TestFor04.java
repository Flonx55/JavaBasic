public class TestFor04
{
	public static void main(String[] args)
	{
		//Fuction:���1~100�б�6��������
		for(int i = 1;i<=100;i++)
		{
			// if(i%6==0)
			// {
				// System.out.println(i);
			// }
			
			if(i%6 != 0)
			{
				continue;//ֹͣ������������ѭ��,����������һ��ѭ��
			}
			System.out.println(i);
		}
	}
}
