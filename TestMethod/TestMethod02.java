import java.util.Scanner;

public class TestMethod02
{
	public static void main(String[] args)
	{
		//功能:我心里有一个数,你来猜,看是否猜对
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数字:");
		int yourNum = sc.nextInt();
		
		System.out.println( isEqual(yourNum,5));
		
		
	}
	private static String isEqual(int yourNum,int myNum)
	{
		//System.out.println();
		return yourNum == myNum?"猜对了":"猜错了";
	}
}