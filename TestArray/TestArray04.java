public class TestArray04
{
	public static void main(String[] args)
	{
		/*ʵ��һ������,����һ������int[] arr = {12,3,7,4,8,125,9,45}	,���������������*/
		/*[1]����һ������*/
		int[] arr = {12,3,7,4,8,125,9,245};
 		/*[2]forѭ��һһ���бȽ�*/
		for(int i = 0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i+1] = arr[i];
			}
			
		}
		/*���*/
		System.out.println(arr[arr.length-1]);
		System.out.println(getMax(arr));
	}
	/*
	����ȡһ������:�������е����ֵ,���ĸ������е����ֵ--->��ȷ������:�ĸ�����---->����ֵ:���ֵ
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