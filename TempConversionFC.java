import java.util.Scanner;
public class TempConversionFC
{
	public static void main(String[] args) {
		
		double temperature, degreesC, degreesF;
		String answer, tmpStr;
		char measurement;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a temperature to be converted and type \"C\" or \"F\" for Celsius or Fahrenheit");
		
		answer = keyboard.nextLine();
		answer = answer.replace(" ", "").toLowerCase(); // deletes space between number and "C" or "F" of input
		int tmpInt = answer.length();
		tmpInt--;    
		measurement = answer.charAt(tmpInt); // index of  char measurement
		tmpStr = answer.substring(0, tmpInt); // finds & stores temperature from input
		temperature = Double.parseDouble(tmpStr);
		
		switch (measurement)
		{
			case 'f' : // converts F to C
				degreesC = 5 * (temperature - 32) / 9;
				//fahrenheit = (9 / 5) * celsius + 32
				System.out.println(answer + " converts to " + degreesC + " Celsius ");
				break;
			case 'c' :// converts C to F
				degreesF = (9 * (temperature) / 5) + 32;
				System.out.println(answer + " converts to " + degreesF + " Fahrenheit ");
				break;
			default: System.out.println("That is not an optional temperature measurement.");
		} 
	}
}
