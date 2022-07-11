class P6
{
	public static void main(String arg[])
	{
		int n,i,j;
		n=5;
		String a,b,c,x;
		a="";
		for(i=1;i<=n;i++)
		{
			b="";
			c=" ";
			a=a+String.valueOf(i);
			for(j=1;j<=n-i;j++)
			{
				b=b+c;
			}
			x=b+a;
			System.out.println(x);
		}
	}
}