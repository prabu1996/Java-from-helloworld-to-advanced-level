class Test23
{
	public static void main(String arg[])
	{
		String a="prabu is a good boy";
		//String b="good boy is prabu";
		String b="Good boy is prabu";
		boolean c=a.regionMatches(11,b,0,4);
		System.out.println(c);
	}
}