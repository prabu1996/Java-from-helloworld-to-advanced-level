class FindingDuplicateElement
{
	public static void main(String arg[])
	{
		int[] a={50,10,20,20,50,50};
		int i,j,n;
		n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element is"+a[i]);
				}
			}
		}
	}
}