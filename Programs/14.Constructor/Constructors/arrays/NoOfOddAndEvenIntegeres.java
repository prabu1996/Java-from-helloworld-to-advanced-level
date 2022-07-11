class NoOfOddAndEvenIntegeres
{
	public NoOfOddAndEvenIntegeres()
	{

	}
	public static void main(String arg[])
	{
		int[] a={0,1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				odd+=1;
			else
				even+=1;		
		}
		System.out.println("No of even integers="+even);
		System.out.println("No of odd integers="+odd);
	}
}