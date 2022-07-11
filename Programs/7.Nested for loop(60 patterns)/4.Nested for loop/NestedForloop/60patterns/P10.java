class P10
{
	public static void main(String arg[])
	{
		int n,i,j,x;
		String ans;
		n=5;
		for(i=1;i<=n;i++)
		{
			x=1;
			ans="";
			for(j=i;j<=n;j++)
			{
				ans=ans+String.valueOf(x);
				System.out.print(j);
				x++;
			}
			System.out.println();
		}
	}
}