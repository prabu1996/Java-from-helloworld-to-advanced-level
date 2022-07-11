class P6
{
	public static void main(String arg[])
	{
		int n,i,j;
		String a,b,c;
		n=5;
		c="";
		for(i=1;i<=n;i++)
		{
				a=" ";
				b="";
				c=c+String.valueOf(i);
				for(j=n-i;j>=1;j--)
				{
					b=a+b;
				}
				b=b+c;
				System.out.println(b);
		}
		
	}
}