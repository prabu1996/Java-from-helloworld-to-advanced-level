class CheckArrayHasZeroOrMinusOne
{
	public static void main(String arg[])
	{
		int[] a={10,25,0,-2,01};
		int n,count,i;
		n=a.length;
		count=0;
		for(i=0;i<n;i++)
		{
			if((a[i]!=0)&&(a[i]!=(-1)))
				count+=1;		
		}
		if(count==n)
			System.out.println("Array not contains 0 and -1");
		else 
			System.out.println("Array contains either 0 or -1");
	}
}