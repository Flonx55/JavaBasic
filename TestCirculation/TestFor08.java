public class TestFor08
{
	public static void main(String[] args)
	{
		//��ӡ�˷��ھ�
		for(int i = 9;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
