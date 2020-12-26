import java.util.Scanner;

public class TestArray05
{
	public static void main(String[] args)
	{
		/*查询指定元素的位置*/
		/*System.out.println("请输入你想查询的元素:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = {1,2,63,74,25,77,53};
		int location = arr.indexAt(num);
		System.out.println(location);-----------false*/
		
		int[] arr = {1,2,35,74,24,245};
		int index = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==74)
			{
				index = i;
			}
		}
		System.out.println(index);
	}
}