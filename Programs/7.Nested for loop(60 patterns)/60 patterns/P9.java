class P9
{
	public static void main(String arg[])
	{
		int n,i,j,a,b,x;
		n=5;
		x=1;
		b=0;
		String y="";
		for(i=1;i<=n;i++)
		{
			a=x;
			for(j=i;j<=i;j++)
			{
				y=y+String.valueOf(a);
				System.out.print(y);
				if(a==1)
					a=0;
				else 
					a=1;	
			}
			x=a;
			System.out.println();
		}
	}
}