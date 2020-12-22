public class TestOpe04
{
	public static void main(String[] args)
	{
		int a = 5;
		a++;//相当于 a=a+1;
		System.out.println(a);
		
		a = 5;
		++a;
		System.out.println(a);
		
		//++单独使用的时候,无论放在前还是后,都是加一操作
		
		//将++参与到运算中:
		a = 5;
		int m = a++ + 7;
		System.out.println(m);
		System.out.println(a);
		
		a = 5;
		int n = ++a +7;
		System.out.println(n);
		System.out.println(a);
	}
}