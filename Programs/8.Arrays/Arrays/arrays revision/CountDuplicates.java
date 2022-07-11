class CountDuplicates
{
	public static void main(String arg[])
	{
		int n,i,j,count,m,p,x,y;
		int[] a={10,10,10,10,10};
		n=a.length;
		m=n-1;
		count=0;
		y=0;
		x=0;
		p=1;
		for(i=0;i<m;i++)
		{
			count=0;
			if(a[i]==a[p])
			{
				p=p+1;
			}
			for(j=p;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count+=1;
				}
			}
			y=y+count;
			System.out.println("p="+p);
			System.out.println("count="+y);
			
		}
		System.out.println("Array length after removing duplicates= "+(n-y));
	}
}