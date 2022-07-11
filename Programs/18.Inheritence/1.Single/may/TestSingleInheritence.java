class Ayyappan
{
	public void father()
	{
		System.out.println("Ayyappan is the father of prabu");
	}
}
class Prabu extends Ayyappan
{
	public void son()
	{
		System.out.println("Prabu is the son of Ayyappan");
	}
}
class TestSingleInheritence
{
	public static void main(String arg[])
	{
		Prabu t1=new Prabu();
		t1.son();
		//Ayyappan t2=new Ayyappan();
		//t2.father();	
		t1.father();
	}
}