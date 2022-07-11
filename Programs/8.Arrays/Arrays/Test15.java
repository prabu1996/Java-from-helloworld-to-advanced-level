class Test15
{
	public static void main(String arg[])
	{
		int n,i,x;
		int[] a={1,5,7,1,18,29,78};
		n=a.length;
		x=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<x)
				x=a[i];
		}
		System.out.println("Smallest num in the array is"+x);
	}
}