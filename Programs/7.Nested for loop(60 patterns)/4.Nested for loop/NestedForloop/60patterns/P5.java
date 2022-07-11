class P5
{
	public static void main(String arg[])
	{
		int n,i,j,a,b;
		String x,y;
		n=4;
		//x="";
		b=1;
		for(i=1;i<=n;i++)
		{
			a=b;
			for(j=1;j<=i;j++)
			{
				
				y=String.valueOf(a);
				System.out.print(y);
				a++;
			}
			b=a;
			System.out.println();
		}
	}
}
