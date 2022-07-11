// switch la string use panna mudiyaadhu
import java.io.*;
class SwitchPNR
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String Need;
			char SI,CI;
			double P,N,R,x,y,SimpleInt,CompoundInt;
			System.out.println("enter principal amount");
			P=Double.parseDouble(t.readLine());
			System.out.println("enter duration");
			N=Double.parseDouble(t.readLine());
			System.out.println("rate of interest");
			R=Double.parseDouble(t.readLine());
			System.out.println("SI or CI ? ");
			Need=t.readLine();
			CharNeed=Need.charAt(1);
			SimpleInt=((P*N*R)/(100));
			x=(1+R);
			y=Math.pow(x,N);
			CompoundInt=((P*y)-(P));
			switch(CharNeed)
			{
				case 'SI':	System.out.println(SimpleInt);	
					break;
				case 'CI':	System.out.println("CI is"+CompoundInt);
					break;
				default :	System.out.println("check input");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}