public class TestArray06
{
	
	public static void main(String[] args)
	{
		/*����һ������,��ѯһ��Ԫ��*/
		int[] arr = {12,34,32,24,35,2,65};
	
		int index = getIndex(arr,65);
		if(index != -1)
		{
			System.out.println("Ԫ�ض�Ӧ��������:"+index);
		}
		else
		{
			System.out.println("�ڸ�������δ�ҵ���Ԫ��!");
		}
		
	}
	public static int getIndex(int[] arr,int element)
	{
		int index = -1;
		for(int i = 0;i <arr.length;i++)
		{
			if(arr[i] == element)
			{
				index = i;
				break;
			}
		}
		return index;
	}
}