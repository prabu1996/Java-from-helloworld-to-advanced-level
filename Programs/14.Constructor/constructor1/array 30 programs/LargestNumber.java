class LargestNumber
{
	public LargestNumber()
	{
		
	}
	public static void main(String arg[])
	{
		int[] a={58,100,4,17,28,79,30};
		int len=a.length;
		int big=a[0];
		for(int i=1;i<len;i++)
		{
			if(a[i]>big)
				big=a[i];
		}
		System.out.println("Biggest number="+big);
	}
}