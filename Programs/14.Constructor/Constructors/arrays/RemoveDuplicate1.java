class RemoveDuplicate1
{
	public RemoveDuplicate1()
	{

	}
	public static void main(String arg[])
	{
		int[] a={10,10,30,40,50,50,30};
		//int[] a={2,2,2,2,2,2};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
					a[j]=0;		
			}	
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]!=0)
				System.out.println("a["+i+"]="+a[i]);	
		}
	}
}