import java.util.Scanner;//形象理解:在java.util下将Scanner拿过来用

public class TestVar11
{
	public static void main(String[] args)
	{
		//求圆的周长和面积
		//[1]提取变量:就是为了一劳永逸,以后只要改变变量的值,下面只要用到这个变量的地方,取值也都发生变化.
		//[2]一个变量被final修饰,这个变量就变成了一个常量,这个常量的值就不可变了,这个常量就为字符常量
		//	约定俗成的规定,字符常量的名字全部大写
		//[3]使用扫描器:Scanner的使用----->注意通过形象的理解去使用
		
		
		final double PI = 3.1415926;
		//给用户一个友好性的提示:
		System.out.println("请输入半径:");
		Scanner sc = new Scanner(System.in);
		//让扫描器扫描键盘录入的int类型的数据
		
		int r = sc.nextInt();
		//int r = 36;
		double c = 2*PI*r;
		System.out.println("周长为:"+c);
		
		double s = PI*5*r;
		System.out.println("面积为:"+s);
		
	}
}