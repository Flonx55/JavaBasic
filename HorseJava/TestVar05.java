public class TestVar05
{
	public static void main(String[] args)
	{
		//�����������͵ı���
		int num1 = 12;//Ĭ������¸�ֵ����ʮ���Ƶ����
		System.out.println(num1);
		int num2 = 012;//ǰ��Ӹ�0,���ֵ���ǰ˽��Ƶ�
		System.out.println(num2);
		int num3 = 0x12;//ǰ�����0x��0X,���ֵ����ʮ������
		System.out.println(num3);
		int num4 = 0b10;//ǰ�����0b����0B,���ֵ���Ƕ�����
		System.out.println(num4);
		
		//����byte���͵ı���
		byte b = 126;//������һ��byte���͵ı���,���ֽ���b,��ֵΪ12
		System.out.println(b);
		short s = 30000;
		System.out.println(s);
		int i = 1234;
		System.out.println(i);
		//��������Ĭ�Ͼ���int���͵�,����12345678910��һ��int���͵���,����int������˵,��������Χ��
		//Ҫ���һ������long���ͱ���,��ô�������L(�Ƽ�)��l
		long num5 = 12345678910L;
		System.out.println(num5);
		//ע��:ֻ�����������int���͵ķ�Χ�˺������Ҫ����L,���������LҲ���Ը�ֵ��long����.
		long num6 = 12;
		System.out.println(num6);
	}
}