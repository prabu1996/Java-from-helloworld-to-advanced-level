class SecondLargestNumber
{
	public SecondLargestNumber()
	{

	}
	public static void main(String arg[])
	{
		int[] a={58,18,1,4,25,785,33};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[j]<a[i])
				{
					int x=a[i];
					a[i]=a[j];
					a[j]=x;	
				}
			}
		}
		System.out.println("SecondLargestNumber="+a[len-2]);
	}
}