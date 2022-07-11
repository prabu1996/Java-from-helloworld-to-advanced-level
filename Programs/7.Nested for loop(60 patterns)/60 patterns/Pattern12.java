class Pattern12
{
	public static void main(String arg[])
	{
		int n,i,j,k,a;
		String x,y,z,m;
		y=" ";
		z="";
		m="";
		n=5;
		a=1;
		for(i=1;i<=9;i=i+2)
		{
			z=z+m+String.valueOf(i);
			x="";
			for(j=1;j<=n-a;j++)
			{
				x=x+y;	
			}
			System.out.println(x+z);
			m=String.valueOf(i+1);
			a++;
		}
	}
}