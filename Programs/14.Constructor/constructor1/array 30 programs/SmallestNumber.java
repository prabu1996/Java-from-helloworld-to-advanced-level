class SmallestNumber
{
	public SmallestNumber()
	{

	}
	public static void main(String arg[])
	{
		int[] a={58,69,10,4,18,29,55};
		int len=a.length;
		int small=a[0];
		for(int i=1;i<len;i++)
		{
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Smallest number="+small);
	}
}