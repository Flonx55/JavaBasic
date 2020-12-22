//局部变量:定义在方法中
//成员变量:定义在类中,方法外

public class TestVar04
{
	int b = 20;
	public static void main(String[] args)
	{
		System.out.println(a);//false
		int a = 10;
		System.out.println(a);//true
		System.out.println(b);//true
		
	}
	public void eat()
	{
		System.out.println(a);//false
		System.out.println(b);//true
		int a = 30;//不是变量的重复定义
		System.out.println(a);//true
	}
}
