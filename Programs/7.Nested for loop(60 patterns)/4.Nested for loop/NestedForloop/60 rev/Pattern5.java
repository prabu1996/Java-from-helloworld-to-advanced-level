class Pattern5
{
	public static void main(String arg[])	
	{
		int n,i,j;
		n=4;
		a=0;
		for(i=0;i<n;i++)
		{
			for(j=a;j<a+1;j++)
			{
				System.out.print(a);
			}
			a=j;
			System.out.println();
		}
	}
}