import java.util.Scanner;

public class TestArray08
{
	public static void main(String[] args)
	{
		/*ɾ��ָ��λ�õ�Ԫ��,*/
		
		int[] arr = {12,235,35,56,3,234,10};
		int[] arrNew = new int[6];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫɾ��Ԫ�ص�����λ��:");
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