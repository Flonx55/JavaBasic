public class TestFor14
{
	public static void main(String[] args)
	{
		//�ȴ�ӡ����һ��������,Ȼ��ĳЩλ���ϴ�ӡ*
		//ĳЩλ���ϴ�ӡ�ո�
		
		int size = 17;
		int startNum = size/2+1;//��ʼ�к�
		int endNum = size/2+1;//�����к�
		boolean flag = true;
		
		for(int i = 1;i <= size;i ++)
		{
			for(int j = 1;j <= size;j ++)
			{
				// if(j>=startNum&&j<=endNum)
				// {
					// System.out.print("*");
				// }
				//ʵ��
				
				if(j == startNum|| j == endNum)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(endNum == size)
			{
				flag = false;
			}
			if(flag)//flag ��true�൱�������ε��ϰ��
			{
				startNum --;
				endNum ++;
			}
			else
			{
				startNum ++;
				endNum --;
			}
		}
	}
}
