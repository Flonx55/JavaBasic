public class TestVar10
{
	public static void main(String[] args)
	{
		double d = 6;//int-->double	�Զ�����ת��
		System.out.println(d);
		int i = (int)6.5;//double-->int	ǿ������ת��(ǿת)
		System.out.println(i);
		
		//��ͬһ�����ʽ��,�ж���������͵�ʱ��,Ӧ����δ���?
		//�����������Ͳ��������ʱ��,��������,��������,�ַ����Ͷ����Բ�������,Ψ���������Ͳ����Բ�������.
		//double d2 = 12+1334L+8.5+25.42F+'a'+true;
		double d2 = 12+1334L+8.5+25.42F+'a';
		System.out.println(d2);
		
		//���ͼ���:�ӵ͵���:
		//byte,short,char--->int--->float--->double
		//����������ʲô?��һ�����ʽ���ж����������͵�ʱ��,Ҫ�ҳ���ǰ���ʽ�м�����ߵ��Ǹ�����,Ȼ������
		//�����Ͷ�ת��Ϊ��ǰ���ʽ�м�����ߵ����ͽ��м���.

		//���¼������������������,����byte,short,char������˵,ֻҪ�����ǵı�����Χ��,��ֵ��ʱ��Ͳ���Ҫ����
		//ǿת,ֱ�Ӹ�ֵ����
		byte b = 12;
		System.out.println(b);
		
		
		
		
		
	}
}