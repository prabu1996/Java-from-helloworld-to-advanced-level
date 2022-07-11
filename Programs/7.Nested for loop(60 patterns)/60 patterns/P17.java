class P17
{
	public static void main(String arg[])
	{
		int n,j,i,k;
		String x,y,a,b;
		y=" ";
		n=5;
		b="* ";
		for(i=1;i<=n;i++)
		{
			x="";
			for(j=i;j<=n-1;j++)
			{
				x=x+y;
			}
			a="";
			for(k=1;k<=i;k++)
			{
				a=a+b; 
			}
			System.out.println(x+a);
		}
	}
}