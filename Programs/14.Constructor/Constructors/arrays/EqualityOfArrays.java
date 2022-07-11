class EqualityOfArrays
{
	public EqualityOfArrays()
	{

	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		//int[] b={10,20,30,40,10};
		int[] b={10,20,30,40,50};
		int count=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					count+=1;
				else
					break;
			}
			if(count==(a.length))
				System.out.println("two arrays are equal");
			else
				System.out.println("two arrays are not equal");
		}
		else
			System.out.println("two arrays are not equal");
	}
}