public class TestArray07
{
	public static void main(String[] args)
	{
		/*给定一个数组,在数组下标为2的位置上添加一个元素91*/
		
		/*给定一个数组*/
		int[] arr = {12,24,25,54,2,45};
		
		/*输出增加元素前的数组*/
		for(int i = 0;i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		/*增加元素*/
		// arr[5] = arr[4];
		// arr[4] = arr[3];
		// arr[3] = arr[2];
		
		for(int i = 5;i >=3;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[2] = 91;

		/*输出增加元素后的数组*/
		
		System.out.println("\n增加元素后的数组:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertElement(int[] )
}