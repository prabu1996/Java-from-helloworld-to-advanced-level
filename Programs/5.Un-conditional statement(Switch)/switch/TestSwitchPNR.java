import java.io.*;
class TestSwitchPNRR
{
	public static void main(String arg[])
	{
	   try
	   {
		DataInputStream t=new DataInputStream(System.in);
		double P,N,R,SI,CI,a,b;
		String TypeOfInterest;
		char InputChar,S,C;
		System.out.println("principal=");
		P=Double.parseDouble(t.readLine());
		System.out.println("Rate=");
		R=Double.parseDouble(t.readLine());
		System.out.println("Time=");
		N=Double.parseDouble(t.readLine());
		System.out.println("give input chaarcter in caps");
		SI=((P*N*R)/100);
		a=(1+R);
		b=Math.pow(a,N);
		CI=((P*b)-(P));
		System.out.println("type of interest");
		TypeOfInterest=t.readLine();
		InputChar=TypeOfInterest.charAt(0);
		switch (InputChar)
		{
			case 'S':	System.out.println("SI is"+SI);
				break;
			case 'C':	System.out.println("CI is"+CI);
				break;
				
			default :	System.out.println("give input in caps");	
		}
			
	       }
	    catch (Exception e)
	    {
	       System.out.println(e);
	    }
	}
}