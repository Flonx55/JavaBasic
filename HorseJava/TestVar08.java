public class TestVar08
{
	public static void main(String[] args)
	{
		char ch1 = 'A';
		System.out.println(ch1+90);
		System.out.println(155-ch1);
		//char�������ǿ��������Ӿ�������������泣��,���ǵײ��ڽ��м����ʱ��,ʵ�����ǰ���ASCII��ִ�е�
		//char������unicode�����д洢��(Unicode����ASCII��,Unicode��ǰ128λ��ASCII)
		
		char ch2 = '��';
		System.out.println(ch2);
		System.out.println(ch2+90);
		System.out.println(20103-ch2);
		
		
		int num1 = (int)ch2;
		System.out.println(num1);
		
		
		char ch6 = '2'+2;
		System.out.println(ch6);
	}
}