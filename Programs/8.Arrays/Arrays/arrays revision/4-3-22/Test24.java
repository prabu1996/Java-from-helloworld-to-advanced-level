class Test24
{
	public static void main(String arg[])
	{
		int i,j,n;
		int[] a={10,10,10,10,10};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[n-1];
					n--;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}