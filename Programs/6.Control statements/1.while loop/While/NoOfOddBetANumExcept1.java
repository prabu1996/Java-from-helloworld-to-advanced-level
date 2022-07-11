class NoOfOddBetANumExcept1
{
	public static void main(String arg[])
	{
		int a,n,b,i;
		a=13;
		i=3;
		n=0;
		while(i<a)
		{
			if(a%i!=0)
			{
				n+=1;
				i+=2;
			}	
		}
		System.out.println(n);
			
	}
}