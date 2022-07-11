class MoveZeroToEnd
{
	public static void main(String arg[])
	{
		int[] a={0,1,0,2,0,3,0,4,0,5};
		int i,j,n,m;
		n=a.length;
		m=n;
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				for(j=i;j<n-1;j++)
				{
					a[j]=a[j+1];	
				}
				a[n-1]=0;
				n--;
				
			}
		}
		for(i=0;i<m;i++)
		{
			System.out.print(a[i]);
		}
	}
}