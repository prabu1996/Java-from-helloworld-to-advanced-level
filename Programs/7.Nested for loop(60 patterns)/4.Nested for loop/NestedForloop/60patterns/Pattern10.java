class Pattern10
{
	public static void main(String arg[])
	{
		int n,i,j,x,z;
		String ans;
		n=5;
		for(i=1;i<=n;i++)
		{
			x=1;
			ans="";
			for(j=i;j<=n;j++)
			{
				ans=ans+String.valueOf(x);
				x++;
			}
			System.out.println(ans);
			if(ans.length()==1)
			{
				for(z=1;z<=n-1;z++)
				{
					ans=ans+String.valueOf(z+1);	
					System.out.println(ans);	
				}
				
			}
				
			
		}
	}
}