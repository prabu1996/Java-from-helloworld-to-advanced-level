import java.io.*;
class TestVowel
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String Alphabet;
			char a;
			System.out.println("enter your alphabet");
			Alphabet=t.readLine();
			a=Alphabet.charAt(0);
			switch(a)
			{
				case 'a' :	
				case 'A' :
				case 'e' :
				case 'E' :	
				case 'i' :
				case 'I' :
				case 'o' :
				case 'O' :
				case 'u' :
				case'U' :	System.out.println("vowel");
					break;
				default :	System.out.println("consonant");
			}

			
		}
		catch (Exception e)
		{
		  System.out.println(e);
		}
	}
}