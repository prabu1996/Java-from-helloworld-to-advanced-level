class DecendingOrder
{
	public static void main(String arg[])
	{
		int n,i,j,x;
		int[] a={15,1,25,8,62,0};
		n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]>a[i])
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}