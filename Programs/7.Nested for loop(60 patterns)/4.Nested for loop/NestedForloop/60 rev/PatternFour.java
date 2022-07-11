class PatternFour
{
	public static void main(String arg[])
	{
		int n=5;
		int i,j;
		String ans="";
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=i;j++)
			{
				ans=String.valueOf(i)+ans;
				System.out.println(ans);
			}
		}
	}
}