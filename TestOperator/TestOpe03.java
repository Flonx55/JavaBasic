public class TestOpe03
{
	public static void main(String[] args)
	{
		System.out.println("5"+'5'+"5");
		//字面值与字符相加输出其ASCII码对应的整数加上该字面值
		//+左右两侧的任意一侧有字符串,那么这个加号就是字符串拼接的作用,结果一定是字符串
		//从左往右判断
		System.out.println(+5);
		System.out.println(5+6);
		System.out.println(5+'6');
		int num = 56;
		System.out.println("num="+num);
		System.out.println(5+6+"7");
		System.out.println(5+'6'+"7");
		System.out.println("5"+6+"7");
	}
}