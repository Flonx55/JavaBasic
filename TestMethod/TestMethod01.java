public class TestMethod01
{
	/*
		方法是:对特定的功能进行提取,形成一个代码片段,这个代码片段就是我们所说的方法
		方法和方法是并列的关系,所以我们定义的方法不能写到main方法中
		
		方法的作用:提高代码的复用性
		方法体:具体的业务逻辑代码
	*/
	
	
	public static void main(String[] args)
	{
		//10+20
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
		
		sum +=num1;
		sum +=num2;
		System.out.println(sum);
		
	}
}