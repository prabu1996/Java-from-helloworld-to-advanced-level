class FindDuplicates
{
	public static void main(String arg[])
	{
		int[] a={1,2,2,3,4,4,5,6,6,6};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count=count+1;
					System.out.println(a[i]);
				}
			}
		}
		System.out.println(count);
	}
}