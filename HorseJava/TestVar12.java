import java.util.Scanner;

public class TestVar12
{
	public static void main(String[] args)
	{
		//����¼��ѧ������Ϣ:����,���,����,�Ա�
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼������:");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("��¼�����:");
		double height = sc.nextDouble();
		System.out.println(height);
		
		System.out.println("��¼���Ա�:");
		//String sexstr = sc.next();
		char sex = sc.next().charAt(0);
		System.out.println(sex);
		
		System.out.println("��¼������:");
		String name = sc.next();
		System.out.println(name);
		
		//��next***���ַ������ַ�����
	}
}
