class P4
{
	public static void main(String arg[])
	{
		int n,i,j;
		String m="";
		n=5;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=i;j++)
			{
				m=String.valueOf(i)+m;
				System.out.print(m);
			}
			System.out.println();
		}
		
	}
}