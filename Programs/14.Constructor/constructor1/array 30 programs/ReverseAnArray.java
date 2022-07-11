class ReverseAnArray
{
	public ReverseAnArray()
	{
	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int n=a.length;
		int[] b=new int[n];
		int c=n-1;
		for(int i=0;i<n;i++)
		{
			b[i]=a[c];
			c--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
		}
	}
}