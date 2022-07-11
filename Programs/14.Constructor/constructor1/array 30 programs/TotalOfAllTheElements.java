class TotalOfAllTheElements
{
	public TotalOfAllTheElements()
	{
	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int len=a.length;
		int total=0;
		for(int i=0;i<len;i++)
		{
			total+=a[i];	
		}
		System.out.println("Total="+total);
	}
	
}