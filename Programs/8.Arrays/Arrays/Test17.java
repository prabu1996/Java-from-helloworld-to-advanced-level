class Test17
{
	public static void main(String arg[])
	{
		int n,i,j,x;
		int[] a={58,68,1,7,18,29,78};
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
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("Second smallest num in the array is"+a[n-2]);
	}
}