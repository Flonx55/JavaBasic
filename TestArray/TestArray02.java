import java.util.Scanner;

public class TestArray02
{
	public static void main(String[] args)
	{
		/*������������ʮ��������ֵ,����������ƽ����*/
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0;i<10;i++)
		{
			System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ�");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		avg = sum/10.0;
		System.out.println("ʮ��ѧ����������:"+sum);
		System.out.println("ʮ��ѧ���ĳɼ���ƽ������:"+avg);
	}
}