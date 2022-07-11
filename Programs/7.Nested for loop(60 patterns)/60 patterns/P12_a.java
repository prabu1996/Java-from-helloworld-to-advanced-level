class P12_a
{
	public static void main(String arg[])
	{
		int n,i,j;
		String x,y,z,zz;
		y=" ";
		n=5;
		i=1;
		z="";
		zz=String.valueOf(i);
		for(;i<=9;i=i+2)
		{
			x="";
			z=z+zz;
			for(j=1;j<=n-1;j++)
			{
				x=x+y;
			}
			n=n-1;
			System.out.println(x+z);
			zz=String.valueOf(i+1)+String.valueOf(i+2);
			
			
		}
	}
}