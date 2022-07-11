class SwapFirstAndLastElement

{
	public static void main(String arg[])
	{
			
			int i,x,n;
			int[] a={10,20,30,40,50};
			n=a.length;
			x=a[0];
			for(i=0;i<n;i++)
			{
				if(i==0)
				{
					a[i]=a[n-1];
				}
				else if(i==n-1)
				{
					a[n-1]=x;
				}
				System.out.println("a["+i+"]="+a[i]);
			}

	}
}