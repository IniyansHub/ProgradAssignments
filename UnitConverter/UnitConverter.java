/*
As an architect, I want to be able to check if 1 cm is equal to 1 cm.
As an architect, I want to be able to check if 1 m is equal to 100 cm, and 100 cm is equal to 0.001 km.
As an architect, I want to be able to know that 1 m + 100 cm = 2 m, or 200 cm + 1 km = 100200 cm.
As an architect, I want to be able to know that 1 m - 50 cm = 0.5 m, 2000 cm – 1 m = 1900 cm.
As an architect I want to be able to check if 1 g is equal to 1 g, and 0.1 kg = 100 g, 
and to know that 10 g + 1 kg = 1010 g, and 1.5 kg - 500 g = 1 kg.
As an architect, I want to be able to check if 0 Celsius is equal to 32 Fahrenheit, 
and 0 Kelvin is equal to -273 Celsius.
*/

public class UnitConverter {
	
	
	public int convertCentimeterToCentimeter(int value) {
		return value;
	}
	
	public int convertMeterToCentimeter(int meterValue) {
		
		return meterValue*100;
	}
	
	public String convertCentimeterToKilomter(int centimeterValue) {
		float kilometerValue=100/100000;
		System.out.println(kilometerValue);
		return "";
		
	}
	
	public int addMeterWithCentimeterAndConvertToMeter(int meterValue,int centimeterValue) {
		meterValue+=(centimeterValue*100);
		return meterValue;
	}
	
	public int addCentimeterWithKilometerAndConvertToCentimeter(int centimeterValue,int kilometerValue) {
		centimeterValue+=(kilometerValue*100000);
		return centimeterValue;
	}
	
	public int convertGramToGram(int gramValue) {
		return gramValue;
	}
	
	public int convertKilogramToGram(double kilogramValue) {
		return (int) (kilogramValue*1000);
	}
	
	public int addGramWithKilogramAndConvertToGram(int gramValue, int kilogramValue) {
		gramValue+=(kilogramValue*1000);
		return gramValue;
	}
	
	public int subractGramFromKilogramAndConvertToKilogram(double kilogramValue, int gramValue) {
		kilogramValue-=(gramValue/1000);
		return (int)kilogramValue;
	}
	
	public int convertCelsiusToFahrenheit(int celsiusValue) {
		int fahrenheit = (0*(9/5))+32;
		return fahrenheit;
	}
	
	public int convertKelvinToCelsius(int kelvinValue) {
		int celsiusValue = (int)(0-273.15);
		return celsiusValue;
	}
}
