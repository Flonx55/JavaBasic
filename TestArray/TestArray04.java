public class TestArray04
{
	public static void main(String[] args)
	{
		/*实现一个功能,给定一个数组int[] arr = {12,3,7,4,8,125,9,45}	,求出数组中最大的数*/
		/*[1]给定一个数组*/
		int[] arr = {12,3,7,4,8,125,9,245};
 		/*[2]for循环一一进行比较*/
		for(int i = 0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i+1] = arr[i];
			}
			
		}
		/*输出*/
		System.out.println(arr[arr.length-1]);
		System.out.println(getMax(arr));
	}
	/*
	想提取一个方法:求数组中的最大值,求哪个数组中的最大值--->不确定因素:哪个数组---->返回值:最大值
	*/
	private static int getMax(int[] arr)
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i+1] = arr[i];
			}
		}
		return arr[arr.length-1];
	}
	
}