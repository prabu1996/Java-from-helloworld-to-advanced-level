class PP5
{
	public static void main(String arg[])
	{
		int n,i,j,a,b;
		n=4;
		b=1;
		for(i=1;i<=n;i++)
		{
			a=b;
			for(j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
			}
			b=a;
			System.out.println();
			
		}
	}
}