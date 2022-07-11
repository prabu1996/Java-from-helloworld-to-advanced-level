class Pattern13
{
	public static void main(String arg[])
	{
		int n,i,j,k,a;
		String x,y,z,m,pre;
		n=5;
		a=1;
		x="";
		y=" ";
		z="";
		pre="";
		k="";
		for(i=1;i<=n;i++)
		{
			z=z+String.valueOf(i);
			pre=z+k;
			for(j=1;j<=a;j++)
			{
				x=x+y;
			}
			System.out.println(x+pre);
			a=a+2;
			k=pre+String.valueOf(i);
	
		}
	}
}