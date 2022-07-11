import java.io.*;
class TestTemp
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			double T,TempInFahrenheit,TempInCelsius,TempInKelvin;
			String Input;
			char Unit;
			System.out.println("temperature=");
			T=Double.parseDouble(t.readLine());
			System.out.println("give input in caps");
			System.out.println("unit of temperature=");
			Input=t.readLine();
			Unit=Input.charAt(0);
			switch(Unit)
			{
				case 'F'	:	//F==T;
						TempInCelsius=(T-32)*5/9;	
						TempInKelvin=(T-32)*5/9+273.15;
						System.out.println("T="+T+"deg F");
						System.out.println("T="+TempInCelsius+"deg C");
						System.out.println("T="+TempInKelvin+"K");
						break;
				case 'C'	:	//C==T;
						TempInFahrenheit=(T*9/5+32);
						TempInKelvin=(T+273.15);
						System.out.println("T="+T+"degC");
						System.out.println("T="+TempInFahrenheit+"degF");
						System.out.println("T="+TempInKelvin+"K");
						break;
				case 'K'	:	//K==T;
						TempInCelsius=(T-273.15);
						TempInFahrenheit=(T-273.15)*9/5+32;
						System.out.println("T="+T+"K");
						System.out.println("T="+TempInCelsius+"degC");
						System.out.println("T="+TempInFahrenheit+"degF");
						break;

		
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	System.out.println("mandapayale");
	}	
}

//avoid unnecessary brackets