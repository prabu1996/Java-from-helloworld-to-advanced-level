class AdditonOfTwoArrays
{
	public AdditonOfTwoArrays()
	{
	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int[] b={1,2,3,4,5};
		int len=a.length;
		int[] c=new int[len];
		for(int i=0;i<len;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println("c["+i+"]="+c[i]);
		}
	}
}