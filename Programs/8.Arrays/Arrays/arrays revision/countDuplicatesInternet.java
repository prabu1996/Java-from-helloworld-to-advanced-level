class countDuplicatesInternet
{
	public static void main(String arg[])
	{
		int[] a={1,2,3,4,2,2,8,8,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
	}
}