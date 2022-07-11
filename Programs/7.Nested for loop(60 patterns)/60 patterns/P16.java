class P16
{
	public static void main(String arg[])
	{
		int n,i,j;
		String x,y;
		n=5;
		y="*";
		for(i=1;i<=n;i++)
		{
			x="";
			for(j=1;j<=i;j++)
			{
				x=x+y;
			}
			System.out.println(x);
		}
	}
}