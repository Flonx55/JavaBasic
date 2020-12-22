public class TestVar07
{
	public static void main(String[] args)
	{
		//定义字符类型的变量:
		char ch1 = 'a';
		System.out.println(ch1);
		char ch2 = 'A';
		System.out.println(ch2);
		char ch3 = '4';
		System.out.println(ch3);
		char ch4 = '中';
		System.out.println(ch4);
		char ch5 = '?';
		System.out.println(ch5);
		//java中无论:字母,数字,符号,中文都是字符类型常量;都占用两个字节
		char ch6 = ' ';
		System.out.println(ch6);
		//字符类型:单引号引起来的单个字符
		//字符类型:单引号引起来的单个字符
		System.out.println("------------------------------------");
		//转义字符\:将后面的普通字符转换为特殊含义
		char ch7  = '\n';
		System.out.println("aaa"+ch7+"bbb");
		System.out.println("aaa\nbbb");
		System.out.println("aaa\tbbb");
		System.out.println("aaa\bbbb");
		System.out.println("\"java\"");
	}
}