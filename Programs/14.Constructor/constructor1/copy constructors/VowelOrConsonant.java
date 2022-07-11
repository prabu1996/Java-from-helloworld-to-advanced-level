import java.util.*;
class SubClass
{
	char letter;
	public SubClass(char letter)
	{
		this.letter=letter;
	}
	public SubClass(SubClass t4)
	{
		this.letter=t4.letter;
	}
	public void function()
	{
		if((letter==a)||(letter==e)||(letter==i)||(letter==o)(letter==u))
		{
			System.out.println("vowel");
		}
		else 
			System.out.println("consonant");
	}
}
class VowelOrConsonant1
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter text");
		String text=t.next();
		char letter=text.CharAt(0);
		SubClass t2=new SubClass(letter); 
		SubClass t3=new SubClass(t2);
		t2.function();

	}
}