class FindDuplicateInStringArray
{
	public FindDuplicateInStringArray()
	{

	}
	public static void main (String arg[])
	{
		String[] a={"ap","pr","ap","pr","app","apz"};
		int len=a.length;
		//System.out.println("length="+len);
		//int count=0;
		for(int i=0;i<len-1;i++)
		{
			int count=0;
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count+=1;
					a[j]=a[len-1];
					len--;
				}
				//System.out.println("count="+count);
			}
			if (count>0)
				System.out.println("Duplicate SubString is "+a[i]);
		}
	}
}