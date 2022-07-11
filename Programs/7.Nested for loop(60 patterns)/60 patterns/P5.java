class P5
{
	public static void main(String arg[])
	{
		int n,i,j,m,p;
		n=4;
		p=1;
		for(i=1;i<=n;i++)
		{
			m=p;
			for(j=1;j<=i;j++)
			{
				System.out.print(m);
				m=m+1;
			}
			p=m;
			System.out.println();
		}
		
	}
}