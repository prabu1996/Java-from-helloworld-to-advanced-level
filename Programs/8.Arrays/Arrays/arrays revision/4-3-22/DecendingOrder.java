class DecendingOrder
{
	public static void main(String arg[])
	{
		int i,j,x,n;
		int[] a={58,68,1,7,18,29,78};
		//int[] a={58,68,1,7,18,29,58};
		n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}