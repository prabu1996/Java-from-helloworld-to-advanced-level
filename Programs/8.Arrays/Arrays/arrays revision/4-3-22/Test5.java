class Test5
{
	public static void main(String arg[])
	{
		int n,i,x;
		int[] a={10,20,30,40,50};
		n=a.length;
		x=0;
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				x=a[i];
				a[i]=a[n-1];
			}
			else if(i==(n-1))
				a[n-1]=x;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}