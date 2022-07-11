class Test14
{
	public static void main(String arg[])
	{
		int n,i,x;
		int[] a={58,68,1,7,18,29,78};
		n=a.length;
		x=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>x)
				x=a[i];	
		}
		System.out.println("Biggest number in the array is"+x);
	}
}