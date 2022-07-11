class Test1
{
	public static void main(String arg[])
	{
		int i,j,n;
		int[] a={1,2,2,3,4,4,5,6,6,7};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]*=0;
				}
			}
		}
		System.out.println(n);
		for(i=0;i<n;i++)
		{
			if(a[i]!=0)
				System.out.print(a[i]+" ");
				
		}
	}
}