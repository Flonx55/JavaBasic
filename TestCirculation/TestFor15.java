public class TestFor15
{
	public static void main(String[] args)
	{
		//����ѭ��
		//��Ǯ��ټ�
		//����5��Ǯһֻ,ĸ��3��Ǯһֻ,С��3ֻһ��Ǯ
		//��100��Ǯ��һ��ֻ��,���й���,ĸ��,С��������Ҫ��,�ʹ���,ĸ��,С��Ҫ�����ֻ�պô���100��Ǯ
		int cock =0;
		int hen = 0;
		int chick = 0;
		for(cock = 1;cock<=19;cock++)
		{
			for(hen = 1;hen <=31;hen++)
			{
				// for(chick = 1;chick <=98;chick++)
				// {
					chick = 100-cock-hen;
					if(cock*15+hen*9+chick == 300)
					{
						System.out.println("cock:"+cock);
						System.out.println("hen:"+hen);
						System.out.println("chick:"+chick);
					}
					
				
			}
		}
		
		
	}
}