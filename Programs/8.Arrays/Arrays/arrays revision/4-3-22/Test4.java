class Test4
{
	public static void main(String arg[])
	{
		int i,n;
		int[] a={10,9,8,7,6};
		n=a.length;
		for(i=0;i<n;i++)
		{
			if(i==1)
				a[i]=50;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}