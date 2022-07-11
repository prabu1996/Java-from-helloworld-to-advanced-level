class P4
{
	public static void main(String arg[])
	{
		int n,i,j;
		String x;
		n=5;
		x="";
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=i;j++)
			{
				x=String.valueOf(i)+x;
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
