public class TestFor15
{
	public static void main(String[] args)
	{
		//三重循环
		//百钱买百鸡
		//公鸡5文钱一只,母鸡3文钱一只,小鸡3只一文钱
		//用100文钱买一百只鸡,其中公鸡,母鸡,小鸡都必须要有,问公鸡,母鸡,小鸡要买多少只刚好凑足100文钱
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