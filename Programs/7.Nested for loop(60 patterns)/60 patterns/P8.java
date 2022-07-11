class P8
{
	public static void main(String arg[])
	{
		int n,i,j,a,x;
		n=5;
		j=5;
		a=1;
		for(i=1;i<=n;i++)
		{
			x=a;
			for(j=1;j<=5;j++)
			{
				System.out.print(x);
				if(x==1)
					x=0;
				else 
					x=1;
			}
			a=x;
			System.out.println();
		}
	}
}