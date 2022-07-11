class CommonElementOfString
{
	public static void main(String arg[])
	{
		String[] a={"p","r","a","b","u"};
		String[] b={"r","v","x","u","a"};
		int x=1;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j])
				{
					count+=1;
				}
			}
			if(count>0)
			{
				System.out.println("common element"+x+"is="+a[i]);
				x++;
			}
			
		}
	}
}