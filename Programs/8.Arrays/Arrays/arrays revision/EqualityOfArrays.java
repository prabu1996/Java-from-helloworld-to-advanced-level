class EqualityOfArrays
{
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int[] b={10,20,30,400,50};
		int count=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=i;j<=i;j++)
				{
					if(a[i]==b[i])
						count+=1;
				}
			}
			if(count==a.length)
				System.out.println("Two arrays are in equality");
			else 
				System.out.println("Two arrays are not in equality");		
		}
		
	}
}