class MOveZerosToLeftAndOneToRight2
{
	public static void main(String arg[])
	{
		int n,i,x,y;
		int[] a={1,0,1,0,1,0,1,0,1,0};
		n=a.length;
		int[] b=new int[n];
		x=0;
		y=n-1;
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				b[x]=0;
				x++;
			}
			else if(a[i]==1)
			{
				b[y]=a[i];
				y--;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
	}
}