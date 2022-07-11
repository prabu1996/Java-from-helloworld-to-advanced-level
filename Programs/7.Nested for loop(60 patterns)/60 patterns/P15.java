class P15
{
	public static void main(String arg[])
	{
		int n,i,j,m,k,u,e;
		String x,y,z,p,c,d;
		y=" ";
		n=5;
		z="";
		p="";
		m=4;
		u=3;
		for(i=1;i<=n;i++)
		{
			x="";
			z=z+String.valueOf(i);
			for(j=1;j<=n-i;j++)
			{
				x=x+y;
			}
			System.out.println(x+z+p);
			p=String.valueOf(i)+p;
		}
		for(i=1;i<4;i++)
		{
			x="";
			for(j=1;j<=n-i;j++)
			{
				x=x+String.valueOf(j);	
			}
			c="";
			for(k=u;k>=1;k--)
			{
				c=String.valueOf(k)+c;
			}
			u--;
			d="";
			for(e=m;e<=4;e++)
			{
				d=d+y;	
			}
			System.out.println(d+x+c);
		}
	}
}