class P7
{
	public static void main(String arg[])
	{
		int n,i,j;
		String a,b,c;
		n=5;
		b=" ";
		c="";
		for(i=1;i<=n;i++)
		{
			a="";
			c=String.valueOf(i)+c;
			for(j=1;j<=n-i;j++)
			{
				a=a+b;	
			}
			System.out.println(a+c);
		}
	}
}