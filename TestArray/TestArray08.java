import java.util.Scanner;

public class TestArray08
{
	public static void main(String[] args)
	{
		/*删除指定位置的元素,*/
		
		int[] arr = {12,235,35,56,3,234,10};
		int[] arrNew = new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除元素的索引位置:");
		int arrayLocation = sc.nextInt();s
		
		for(int i = 0;i<arrayLocation;i++)
		{
			arrNew[i] = arr[i];
		}
		
		for(int i = arrayLocation;i<arrNew.length;i++)
		{
			arrNew[i] = arr[i+1];

		}
		
		for(int num:arrNew)
		{
			System.out.print(num+ " ");
		}
		
		
		
	}
}