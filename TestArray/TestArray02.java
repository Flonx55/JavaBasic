import java.util.Scanner;

public class TestArray02
{
	public static void main(String[] args)
	{
		/*用数组来接收十个整型数值,求其总数和平均数*/
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0;i<10;i++)
		{
			System.out.println("请输入第"+(i+1)+"个同学的成绩");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		avg = sum/10.0;
		System.out.println("十个学生的总数是:"+sum);
		System.out.println("十个学生的成绩的平均数是:"+avg);
	}
}