import java.util.Scanner;

public class TestVar12
{
	public static void main(String[] args)
	{
		//键盘录入学生的信息:年龄,身高,姓名,性别
		//键盘录入年龄
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入年龄:");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("请录入身高:");
		double height = sc.nextDouble();
		System.out.println(height);
		
		System.out.println("请录入性别:");
		//String sexstr = sc.next();
		char sex = sc.next().charAt(0);
		System.out.println(sex);
		
		System.out.println("请录入姓名:");
		String name = sc.next();
		System.out.println(name);
		
		//用next***对字符串和字符无用
	}
}
