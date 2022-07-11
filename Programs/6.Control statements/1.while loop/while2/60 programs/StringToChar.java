class StringToChar
{
	public static void main(String arg[])
	{
		String x="123";
		//char y=x.charAt();
		int y=x.length();
		int i=0;
		while(i<y)
		{
			char c=x.charAt(i);
			System.out.println(c);
		}
	}
}