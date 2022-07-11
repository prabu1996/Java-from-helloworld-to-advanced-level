class Swap
{
	public Swap()
	{

	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int n=a.length;
		int x=a[0];
		for(int i=0;i<n;i++)
		{
			if(i==0)
				a[i]=a[n-1];
			else if(i==(n-1))
				a[i]=x;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}