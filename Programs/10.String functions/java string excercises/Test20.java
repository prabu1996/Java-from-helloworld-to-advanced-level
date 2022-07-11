class Test20
{
	public static void main(String arg[])
	{
		String a="prabu";
		String b="prabu";
		String c=a.intern();
		String d=new String("prabu");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		System.out.println(a==d);
	}
}