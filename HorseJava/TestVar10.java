public class TestVar10
{
	public static void main(String[] args)
	{
		double d = 6;//int-->double	自动类型转换
		System.out.println(d);
		int i = (int)6.5;//double-->int	强制类型转换(强转)
		System.out.println(i);
		
		//在同一个表达式中,有多个数据类型的时候,应该如何处理?
		//多种数据类型参与运算的时候,整数类型,浮点类型,字符类型都可以参与运算,唯独布尔类型不可以参与运算.
		//double d2 = 12+1334L+8.5+25.42F+'a'+true;
		double d2 = 12+1334L+8.5+25.42F+'a';
		System.out.println(d2);
		
		//类型级别:从低到高:
		//byte,short,char--->int--->float--->double
		//级别用来做什么?当一个表达式中有多种数据类型的时候,要找出当前表达式中级别最高的那个类型,然后其余
		//的类型都转换为当前表达式中级别最高的类型进行计算.

		//以下几种情况属于特殊情形,对于byte,short,char类型来说,只要在他们的表述范围中,赋值的时候就不需要进行
		//强转,直接赋值即可
		byte b = 12;
		System.out.println(b);
		
		
		
		
		
	}
}