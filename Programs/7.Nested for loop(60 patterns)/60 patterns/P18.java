class P18
{
	public static void main(String arg[])
	{
		int n,i,j,m;
		String x,y,a;
		y="* ";
		n=5;
		m=4;
		for(i=1;i<=n;i++)
		{
			x="";
			for(j=1;j<=i;j++)
			{
				x=x+y;
			}
			System.out.println(x);
		}
		for(i=1;i<=m;i++)
		{	
			a="";
			for(j=m;j>=1;j--)
			{
				a=a+y;
			}
			System.out.println(a);		
		}
	}
}