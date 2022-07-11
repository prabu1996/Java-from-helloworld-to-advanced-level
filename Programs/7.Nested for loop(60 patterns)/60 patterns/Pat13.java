class Pat13
{
	public static void main(String arg[])
	{
		int n,i,j,a;
		String x,y,z,m;
		n=5;
		x="";
		y=" ";
		z="";
		m="";
		a=1;
		for(i=1;i<=n;i++)
		{
			z="";
			x=x+String.valueOf(i);	
			for(j=a;j<=4;j++)
			{
				z=z+y;
			}
			System.out.println(z+x+m);
			m=String.valueOf(i)+m;
			a++;
		}
	}
}