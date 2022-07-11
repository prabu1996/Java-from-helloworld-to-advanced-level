class ArrayWithoutZeroAndMinusOne
{
	public ArrayWithoutZeroAndMinusOne()
	{

	}
	public static void main(String arg[])
	{
		//int[] a={10,20,30,40,50};
		//int[] a={10,20,0,40,50};
		//int[] a={10,20,30,-1,40};
		int[] a={-1,0,10,20,30};
		int len=a.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			if((a[i]==0)||(a[i]==-1))
				count+=1;
		}
		if(count>0)
			System.out.println("Array contains either 0 or -1 or both");	
		else
			System.out.println("Array doesn't contains 0 or -1 or both");
	}
}