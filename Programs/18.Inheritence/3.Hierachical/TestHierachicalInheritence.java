class Ayyappan
{
	public void father()
	{
		System.out.println("Ayyappan is the father of abi and prabu");
	}
}
class Prabu extends Ayyappan
{
	public void child2()
	{
		System.out.println("Prabu is the second child of ayyappan");
	}
}
class Abi extends Ayyappan
{ 
	public void child1()
	{
		System.out.println("Abi is the first child of ayyappan");
	}
}
class TestHierachicalInheritence
{
	public static void main(String arg[])
	{
		Abi t1=new Abi();
		t1.child1();
		t1.father();
		Prabu t2=new Prabu();
		t2.child2();
		t2.father(); 	
	}
}