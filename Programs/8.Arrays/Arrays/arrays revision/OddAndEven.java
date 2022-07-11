class OddAndEven
{
	public static void main(String arg[])
	{
		int[] a={1,2,2,4,5,6};
		int n=a.length;
		int x=0;
		int y=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				x=x+1;
			else 
				y=y+1;
		}
		System.out.println("no of odd integeres in the array="+y);
		System.out.println("no of even integeres in the array="+x);
	}
}