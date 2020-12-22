public class TestVar08
{
	public static void main(String[] args)
	{
		char ch1 = 'A';
		System.out.println(ch1+90);
		System.out.println(155-ch1);
		//char类型我们看到的样子就是它本身的字面常量,但是底层在进行计算的时候,实际上是按照ASCII码执行的
		//char类型是unicode码表进行存储的(Unicode兼容ASCII码,Unicode的前128位置ASCII)
		
		char ch2 = '中';
		System.out.println(ch2);
		System.out.println(ch2+90);
		System.out.println(20103-ch2);
		
		
		int num1 = (int)ch2;
		System.out.println(num1);
		
		
		char ch6 = '2'+2;
		System.out.println(ch6);
	}
}