class StringLength
{
	public static void main(String arg[])
	{
		String a="prabu";
		int len=a.length();
		System.out.println(len);
		int i=0;
		while(i<len)
		{
			System.out.println(a.charAt(i));
			i++;
		}
	}
}