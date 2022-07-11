import java.io.DataInputStream;
class TestGradeNestedIf
{
	public static void main(String arg[])
	{
	  try
	  {
 		DataInputStream t=new DataInputStream(System.in);
		int tamil,english,maths,science,s_science,avg;
		System.out.println("enter tamil marks");
		tamil=Integer.parseInt(t.readLine());
		System.out.println("enter english marks");
		english=Integer.parseInt(t.readLine());
		System.out.println("enter maths marks");
		maths=Integer.parseInt(t.readLine());
		System.out.println("enter science marks");
		science=Integer.parseInt(t.readLine());
		System.out.println("enter s.science marks");
		s_science=Integer.parseInt(t.readLine());
		avg=0;
		if((tamil>=35)&&(english>=35)&&(maths>=35)&&(science>=35)&&(s_science>=35))
		{
			avg=((tamil+english+maths+science+s_science)/5);
			if((avg>=35)&&(avg<50))
				System.out.println("E grade");
			if((avg>=50)&&(avg<60))
				System.out.println("D grade");
			if((avg>=60)&&(avg<70))
				System.out.println("C grade");
			if((avg>=70)&&(avg<80))
				System.out.println("B grade");
			if((avg>=80)&&(avg<90))
				System.out.println("A grade");
			if((avg>=90))
				System.out.println("S grade");
		}
		else 
			System.out.println("first pass pannu ,apram grade podren");
	  }
	  catch (Exception e)
	  {
	    System.out.println(e);
	  }
	}
}