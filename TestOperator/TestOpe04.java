public class TestOpe04
{
	public static void main(String[] args)
	{
		int a = 5;
		a++;//�൱�� a=a+1;
		System.out.println(a);
		
		a = 5;
		++a;
		System.out.println(a);
		
		//++����ʹ�õ�ʱ��,���۷���ǰ���Ǻ�,���Ǽ�һ����
		
		//��++���뵽������:
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