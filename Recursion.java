class LearnRecursion
{
	public static void main(String[] args)
	{
		//tellStory(10);
		//System.out.println(jiecheng(5));
		System.out.println(fib(10));
		
	}
	
	 static void tellStory(int storyCount)
	{
		if(storyCount == 0)
		{
		System.out.println("�����չ�");
		return;
		}
		System.out.println("��"+storyCount+"������");
		System.out.println("��ǰ����ɽ");
		System.out.println("ɽ��������");
		System.out.println("�����и��Ϻ��н�����");
		System.out.println("����ʲô��?");
		
		tellStory(storyCount-1);
		
	}
	static long jiecheng(int num)
	{
		if(num==1)
			return 1;
		else
			return num*jiecheng(num-1);
		
	}
	//쳲���������
	static long fib(int num)
	{
		if(num == 1)
			return 1;
		if(num == 2)
			return 1;
		
		return fib(num-1)+fib(num-2);
	}	
	//������̨�� -n̨��,���ܴӵ�����̨��,����һ��
	//��1��̨��,Ҳ����һ��������̨��
	//��һ���ж���������
	static long fogJump(int num)
	{
		if(num == 1) return 1;
		if(num == 2) return 2;
		
		return fogJump(num)+fogJump(num-1);
	}
		
}