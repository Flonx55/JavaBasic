import java.util.Scanner;

public class TestMethod02
{
	public static void main(String[] args)
	{
		//����:��������һ����,������,���Ƿ�¶�
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����:");
		int yourNum = sc.nextInt();
		
		System.out.println( isEqual(yourNum,5));
		
		
	}
	private static String isEqual(int yourNum,int myNum)
	{
		//System.out.println();
		return yourNum == myNum?"�¶���":"�´���";
	}
}