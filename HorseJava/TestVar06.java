public class TestVar06
{
	public static void main(String[] args)
	{
		//�������͵ĳ�����������ʽ
		//ʮ������ʽ:
		double num1 = 3.14;
		System.out.println(num1);
		//��ѧ������:
		double num2 = 314E-2;
		System.out.println(num2);
		
		//�������͵ı���:
		//������Ĭ����double���͵�,Ҫ�뽫һ��double���͵�������float����,����������F����f
		float f1 = 3.14159265222F;
		System.out.println(f1);
		//ע��:double���ͺ�����Լ�D����d,��������һ�㶼ʡ�Բ�д
		double d1 = 3.14159265222;
		System.out.println(d1);
		
		//ע��:������ò�Ҫ���и������͵ıȽ�:
		float f2 = 0.3F;
		double d2 = 0.3;
		System.out.println(f2==d2);
	}
}