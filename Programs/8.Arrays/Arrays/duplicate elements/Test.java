class Test
{
	public static void main(String arg[])
	{
		int i,j,n;
		int[] a={2,2,2,2,2};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					
					n--;
				}
			}
		}
		System.out.println(n);
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}
}