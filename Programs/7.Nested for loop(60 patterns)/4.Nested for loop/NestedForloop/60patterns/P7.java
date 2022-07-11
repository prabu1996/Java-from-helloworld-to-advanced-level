class P7
{
	public static void main(String arg[])
	{
		int n,i,j;
		String x,y,m;
		n=5;
		m="";
		for(i=1;i<=n;i++)
		{
			x="";
			y=" ";
			m=String.valueOf(i)+m;
			for(j=n-i;j>=1;j--)
			{
				x=y+x;		
			}
			x=x+m;
			System.out.println(x);	
		}
	}
}