public class TestArray06
{
	
	public static void main(String[] args)
	{
		/*给定一个数组,查询一个元素*/
		int[] arr = {12,34,32,24,35,2,65};
	
		int index = getIndex(arr,65);
		if(index != -1)
		{
			System.out.println("元素对应的索引是:"+index);
		}
		else
		{
			System.out.println("在该数组中未找到该元素!");
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