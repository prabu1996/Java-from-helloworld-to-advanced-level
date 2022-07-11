class P12
{
	public static void main(String arg[])
	{
		int n,i,j,a;
		String p,q,r,s;
		p="";
		q=" ";
		n=5;
		a=0;
		s="";
		for(i=1;i<=n;i++)
		{
			a=a+i;
			s=s+String.valueOf(a);
			for(j=1;j<=n-i;j++)
			{
				p=p+q;
			}
			System.out.println(p+s);
			s=s+String.valueOf(a+1);
		}
	}
}