class Array3
{
	public Array3()
	{
	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int len=a.length;
		a[1]=50;
		for(int i=0;i<len;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}

	