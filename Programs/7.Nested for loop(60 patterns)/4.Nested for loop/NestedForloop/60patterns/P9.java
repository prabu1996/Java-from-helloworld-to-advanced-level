class P9
{
	public static void main(String arg[])
	{
		int n,i,j,x,a;
		String y="";
		n=5;
		x=1;
		for(i=1;i<=n;i++)
		{
			a=x;
			for(j=i;j<=i;j++)
			{
				y=y+String.valueOf(a);
				System.out.println(y);
				if(a==1)
					x=0;
				else 
					x=1;	
			}
			
			
		}
	}
}