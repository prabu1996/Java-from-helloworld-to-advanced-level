class Test24Copy
{
	public static void main(String arg[])
	{
		int i,j,n;
		int[] a={10,20,10,30,10};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=0)
				System.out.println("a["+i+"]="+a[i]);
		}
	}
}