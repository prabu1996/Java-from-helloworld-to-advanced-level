class PrintLeaderElements
{
	public static void main(String arg[])
	{
		int[] a={16,17,4,3,5,2};
		int n,i,j,m,x,count;
		n=a.length;
		count=0;
		x=1;
		m=n-1;
		for(i=0;i<n-1;i++)
		{
			count=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					count+=1;
				}
			}
			if(count==m)
			{
				System.out.println("leader element"+x+"is "+a[i]);
				x++;
			}
			else 
				System.out.println(a[i]+" is not leader element");
			m--;
		}
	}
}