class A
{
	int score,rank;
	String name;
	public A(int x,String y)
	{
		score=x;
		name=y;		
	}
	public A(int x,String y,int z)
	{
		score=x;
		name=y;
		rank=z;	
	}
	public void function()
	{
		System.out.println(score+" "+name+" "+rank);
	}
}
class Test1
{
	public static void main(String arg[])
	{
		A m=new A(80,"prabu"); //returns null for rank
		A n=new A(90,"abi",1);
		m.function();
		n.function();
	}
}
