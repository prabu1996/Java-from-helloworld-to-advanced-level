class RemoveDuplicate
{
	public RemoveDuplicate()
	{

	}
	public static void main(String arg[])
	{
		//int[] a={10,20,30,40,50,50};
		int[] a={2,2,2,2,2,2};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[len-1];
					len--;
				}		
			}
			
			
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("a["+i+"]="+a[i]);
				len--;
			}
			else	
				System.out.println("a["+i+"]="+a[i]);	
		}
	}
}