public class TestArray07
{
	public static void main(String[] args)
	{
		/*����һ������,�������±�Ϊ2��λ�������һ��Ԫ��91*/
		
		/*����һ������*/
		int[] arr = {12,24,25,54,2,45};
		
		/*�������Ԫ��ǰ������*/
		for(int i = 0;i <arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		/*����Ԫ��*/
		// arr[5] = arr[4];
		// arr[4] = arr[3];
		// arr[3] = arr[2];
		
		for(int i = 5;i >=3;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[2] = 91;

		/*�������Ԫ�غ������*/
		
		System.out.println("\n����Ԫ�غ������:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertElement(int[] )
}