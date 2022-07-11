class Test17
{
	public static void main(String arg[])
	{
		//String a="prabuAyyappan";
		String a=new String("prabuAyyappan");
		char[] b=new char[8];
		a.getChars(5,13,b,0);
		System.out.println(b);
		//char[] arr = new char[] { ' ', ' ', ' ', ' ',
                                  ' ', ' ', ' ', ' ' };
       		// str.getChars(4, 10, arr, 2);
	}
}