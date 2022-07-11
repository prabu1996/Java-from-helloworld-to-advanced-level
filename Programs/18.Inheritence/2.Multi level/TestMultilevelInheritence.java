class Krishnan
{
	public void parent()
	{
		System.out.println("Krishnan is the father of Ayyappan");
	}
}
class Ayyappan extends Krishnan
{
	public void child2()
	{
		System.out.println("Ayyappan is the son of Krishnan");
	}
}
class Prabu extends Ayyappan
{
	public void child1()
	{
		System.out.println("Prabu is the son of Ayyappan");
	}
}
class TestMultilevelInheritence
{
	public static void main(String arg[])
	{
		Prabu t1=new Prabu();
		t1.child1();
		t1.child2();	
		t1.parent();
	}
}