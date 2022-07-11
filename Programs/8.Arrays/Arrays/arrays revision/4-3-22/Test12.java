class Test12
{
	public static void main(String arg[])
	{
		int n,i,count,j;
		int[] a={68,78,7,1,18,29,58};
		n=a.length;
		int[] b=a;
		int[] c=new int[n];
		count=0;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(b[i]<a[j])
				{
					count+=1;
				}
				else 
				{
					c[i]=a[j];
					b[i]=a[j];
				}
			}
			if(count==n-1)
				c[i]=b[i];	
		}
		for(i=0;i<n;i++)
		{
			System.out.println("c["+i+"]="+c[i]);

		}
	}
}