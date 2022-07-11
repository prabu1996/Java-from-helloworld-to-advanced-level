class SecondSmallestNumber
{
	public SecondSmallestNumber()
	{

	}
	public static void main(String arg[])
	{
		int[] a={58,1,4,85,652,11,23};
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
		System.out.println("Second smallest number="+a[1]);
	}
}