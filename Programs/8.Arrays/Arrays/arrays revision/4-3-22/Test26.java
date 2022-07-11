class Test26
{
	public static void main(String arg[])
	{
		int i,j,n;
		int[] a={10,0,20,50,30};
		n=a.length;
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]!=0)
				b[i]=a[i];
			else
			{
				b[i]=a[i+1];
				if(i<n)
					a[i+1]=0;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
		}
	}
}