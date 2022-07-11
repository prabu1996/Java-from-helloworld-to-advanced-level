class Sub
{
	public void subMethod(String fname)
	{
		System.out.println(fname+" Ayyappan");
	}
}
class MainArgumentExample
{
	public static void main(String arg[])
	{
		Sub m=new Sub();
		m.subMethod("prabu");
		m.subMethod("abi");
	}
}