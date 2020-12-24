public class TestOpe05
{
	public static void main(String[] args)
	{
		int a =5;
		System.out.println(a++ + a++);//5+6==11
		System.out.println(a++ + ++a);//5+7==12false	7+9==16
		System.out.println(++a + a++);//6+6==12false	10+10==20
		System.out.println(++a + ++a);//6+7==13false	12+13==25
		//考虑前后逻辑//
		//运算符的优先级问题:++级别高于+
		//
	}
}