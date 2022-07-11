 abstract class AbstractClass
{
	abstract public void bark(); //nobody for abstract methods
}
class Dog extends AbstractClass
{
	public void bark()
	{
		System.out.println("Bow Bow");
	}	
}
class Animal
{
	public static void main(String arg[])
	{
		Dog t1=new Dog();
		//AbstractClass t2=new AbstractClass(); //we can't instantice abstract classes
		t1.bark();
		
	}
}