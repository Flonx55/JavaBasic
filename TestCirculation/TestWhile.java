public class TestWhile
{
	public static void main(String[] args)
	{
		//Fuction:1+2+3+4
		int i = 100;
		int sum = 0;
		while(i>0)
		{
			sum += i--;
		}
		System.out.println(sum);
		//Function:1+...+1000
		i = 1000;
		sum = 0;
		while(i>0)
		{
			sum +=i;
			i -= 2;
		}
		System.out.println(sum);
		//Function:5+10+...+100
		i = 100;
		sum = 0;
		while(i>0)
		{
			sum +=i;
			i -=5;
		}
		System.out.println(sum);
		//Function:1*3*5*...13
		i = 13;
		sum = 1;
		while(i>0)
		{
			sum *=i;
			i -=2;
		}
		System.out.println(sum);
		//Function:1+3+5+...+99
		i = 1;
		sum = 0;
		while(i<=99)
		{
			sum +=i;
			i +=2;
		}
		System.out.println(sum);
		
	}
}
//[1]循环作用:将部分代码重复执行.
//	循环只是提高了程序员编写代码的效率,但是底层执行的时候依然是重复执行.
//[2]循环四要素:条件初始化,条件判断,循环体,迭代

//初始化谁,就判断谁,判断谁,就迭代谁