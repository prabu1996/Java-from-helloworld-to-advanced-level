import java.io.*;
class TestVowelOr
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			String X;
			System.out.println("letter");
			X=t.readLine();
			char Y;
			Y=X.charAt(0);
			if((Y=='a')||(Y=='A'))
				System.out.println("Vowel");
			else if((Y=='u')||(Y=='U'))
				System.out.println("Vowel");
			else if ((Y=='e')||(Y=='E'))
				System.out.println("Vowel");
			else if ((Y=='i')||(Y=='I'))
				System.out.println("Vowel");
			else if ((Y=='o')||(Y=='O'))
				System.out.println("Vowel");
			else
				System.out.println("Consonant");

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}