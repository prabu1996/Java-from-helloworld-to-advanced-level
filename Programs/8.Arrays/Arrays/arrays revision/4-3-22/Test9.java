class Test9
{
	public static void main(String arg[])
	{
		int n,i,sum;
		int[] a={10,20,30,40,50};
		n=a.length;
		sum=0;
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of array elements="+sum);
	}
}