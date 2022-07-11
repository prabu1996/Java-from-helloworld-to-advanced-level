class CommonElementsBetTwoStringArrays
{
	public CommonElementsBetTwoStringArrays()
	{

	}
	public static void main(String arg[])
	{
		String[] a={"ap","pr","ra","bu"};
		//two strings must be of same size
		//String[] b={"app","pr","raa","ch"};
		String[] b={"ap","ap","ap","ap"};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			int count=0;
			for(int j=0;j<len;j++)
			{
				if(a[i]==b[j])
					count+=1;
			}
			if(count>0)
				System.out.println("common element is "+a[i]);
		}
	}
}