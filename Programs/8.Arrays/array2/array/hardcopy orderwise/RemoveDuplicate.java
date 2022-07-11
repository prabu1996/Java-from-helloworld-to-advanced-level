class RemoveDuplicate
{
	public static void main(String arg[])
	{
		int[] a={1,1,1,2,3};
		int n=a.length;
		int m,i,j,k;
		m=n;
		System.out.println(n);
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					m=m-1;	
				}
			}
				
		}
		System.out.println(m);
	}
}