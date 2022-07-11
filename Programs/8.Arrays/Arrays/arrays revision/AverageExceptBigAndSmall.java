class AverageExceptBigAndSmall
{
	public static void main(String arg[])
	{
		int[] a={58,68,7,1,18,29,78};
		int n=a.length;
		int avg;
		int sum=0;
		double avg=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[i])
				{
					int x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if((i!=0)&&(i!=n-1))
			{
				sum=sum+a[i];
			}
		}
		System.out.println("avg="sum/n);
	}
}