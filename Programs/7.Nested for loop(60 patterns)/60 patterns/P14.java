class P14
{
	public static void main(String arg[])
	{
		int n,i,j,k,a,b;
		String x,y,z,h;
		n=5;
		a=5;
		b=4;
		z="";
		h=" ";
		for(i=1;i<=n;i++)
		{
			x="";
			y="";
			for(j=1;j<=a;j++)
			{
				x=x+String.valueOf(j);
			}
			for(k=1;k<=b;k++)
			{
				y=String.valueOf(k)+y;
			}	
			System.out.println(z+x+y);
			a--;
			b--;
			z=z+h;
		}
	}
}