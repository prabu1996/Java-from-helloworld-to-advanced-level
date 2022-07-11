import java.io.*;
class TestMarks
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			String name,rollno,gender;
			int T,E,M,S,SS,avg;
			avg=0;
			System.out.println("name");
			name=t.readLine();
			System.out.println("rollno");
			rollno=t.readLine();
			System.out.println("gender");
			gender=t.readLine();
			char G;
			G=gender.charAt(0);
			System.out.println("Tamil");
			T=Integer.parseInt(t.readLine());
			System.out.println("English");
			E=Integer.parseInt(t.readLine());
			System.out.println("Maths");
			M=Integer.parseInt(t.readLine());
			System.out.println("Science");
			S=Integer.parseInt(t.readLine());
			System.out.println("Social Science");
			SS=Integer.parseInt(t.readLine());
			System.out.println(name);
			System.out.println(rollno);
			System.out.println(G);
			avg=((T+E+M+S+SS)/5);
			if ((T<=34)||(E<=34)||(M<=34)||(S<=34)||(SS<=34))
				System.out.println("FAIL");
			else if ((avg>=35)&&(avg<=40))
				System.out.println("E grade");
			else if ((avg>41)&&(avg<=60))
				System.out.println("D grade");
			else if ((avg>61)&&(avg<=80))
				System.out.println("B grade");
			else if ((avg>81)&&(avg<=90))
				System.out.println("A grade");
			else 
				System.out.println("A+ grade");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}