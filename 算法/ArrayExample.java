public class ArrayExample
{
	public static void main(String[] args)
	{
		int arrays[] = {2,5,1,3,4};
		int temp;
		
		if(arrays[0] > arrays[1])//µÚÒ»ÌËÅÅĞò
		{
			temp = arrays[0];
			arrays[0] = arrays[1];
			arrays[1] = temp;
		}
		if(arrays[1]>arrays[2])
		{
			temp = arrays[1];
			arrays[1] = arrays[2];
			arrays[2] = temp;
		}
		if(arrays[2]>arrays[3])
		{
			temp = arrays[2];
			arrays[2] = arrays[3];
			arrays[3] = temp;
		}
		if(arrays[3]>arrays[4])
		{
			temp = arrays[3];
			arrays[3] = arrays[4];
			arrays[4] = temp;
		}
		for(int i:arrays)
		{
			System.out.println(i);
		}
	}
}
