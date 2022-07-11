class DecendingOrder
{
	public DecendingOrder()
	{

	}
	public static void main(String arg[])
	{
		int[] a={58,1,4,17,78,29};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]<a[j])
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