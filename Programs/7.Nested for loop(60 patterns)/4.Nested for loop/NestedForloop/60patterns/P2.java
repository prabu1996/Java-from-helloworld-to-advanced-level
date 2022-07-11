class P2
{
	public static void main(String arg[])
	{
		int n,i,j;  //n-no of steps in output
		n=5;
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}