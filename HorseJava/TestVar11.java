import java.util.Scanner;//�������:��java.util�½�Scanner�ù�����

public class TestVar11
{
	public static void main(String[] args)
	{
		//��Բ���ܳ������
		//[1]��ȡ����:����Ϊ��һ������,�Ժ�ֻҪ�ı������ֵ,����ֻҪ�õ���������ĵط�,ȡֵҲ�������仯.
		//[2]һ��������final����,��������ͱ����һ������,���������ֵ�Ͳ��ɱ���,���������Ϊ�ַ�����
		//	Լ���׳ɵĹ涨,�ַ�����������ȫ����д
		//[3]ʹ��ɨ����:Scanner��ʹ��----->ע��ͨ����������ȥʹ��
		
		
		final double PI = 3.1415926;
		//���û�һ���Ѻ��Ե���ʾ:
		System.out.println("������뾶:");
		Scanner sc = new Scanner(System.in);
		//��ɨ����ɨ�����¼���int���͵�����
		
		int r = sc.nextInt();
		//int r = 36;
		double c = 2*PI*r;
		System.out.println("�ܳ�Ϊ:"+c);
		
		double s = PI*5*r;
		System.out.println("���Ϊ:"+s);
		
	}
}