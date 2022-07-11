class AscendingOrder
{
	public AscendingOrder()
	{

	}
	public static void main(String arg[])
	{
		int[] a={57,4,1,19,28,69};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int x=a[j];
					a[j]=a[i];
					a[i]=x;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}