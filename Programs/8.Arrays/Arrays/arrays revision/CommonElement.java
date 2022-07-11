class CommonElement
{
	public static void main(String arg[])
	{
		int[] a={1,3,5,7,9};
		int[] b={0,1,7,9,2};
		int count=0;
		int x=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count+=1;
				}
			}
			if(count>0)
			{
				System.out.println("common element"+x+" is"+a[i]);
				x++;
			}
		}
	}
}