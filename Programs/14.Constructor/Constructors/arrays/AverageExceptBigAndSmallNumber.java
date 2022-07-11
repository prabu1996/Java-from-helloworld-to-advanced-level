class AverageExceptBigAndSmallNumber
{
	public AverageExceptBigAndSmallNumber()
	{
		
	}
	public static void main(String arg[])
	{
		int[] a={58,4,1,18,29,78,68,2};
		int len=a.length;
		int sum=0;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[j]>a[i])
				{
					int x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(int i=1;i<len-1;i++)
		{
			sum+=a[i];
			//System.out.println("a["+i+"]="+a[i]);	
		}
		int avg=sum/(len-2);
		System.out.println("avg="+avg);	
	}
}