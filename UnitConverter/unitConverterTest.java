import org.junit.Assert;
import org.junit.Test;

public class UnitConverterTest {
	
	UnitConverter unitConverter = new UnitConverter();
	

	@Test
	public void testCentimterToCentimeter() {
		Assert.assertEquals(1,unitConverter.convertCentimeterToCentimeter(1));
	}
	
	@Test
	public void testMeterToCentimeter() {
		Assert.assertEquals(100,unitConverter.convertMeterToCentimeter(1));
	}
	
	@Test
	public void testCentimeterToKilometer() {
		Assert.assertEquals("0.001",unitConverter.convertCentimeterToKilomter(100));
	}
	
	@Test
	public void testAddMeterWithCentimeterAndConvertToMeter() {
		Assert.assertEquals(2,unitConverter.addMeterWithCentimeterAndConvertToMeter(1,100));
	}
	
	@Test
	public void testAddCentimeterWithKilometerAndConvertToCentimeter() {
		Assert.assertEquals(100200,unitConverter.addCentimeterWithKilometerAndConvertToCentimeter(200,1));
	}
	
	@Test
	public void testConvertGramToGram() {
		Assert.assertEquals(1,unitConverter.convertGramToGram(1));
	}
	
	@Test
	public void testConvertKilogramToGram() {
		Assert.assertEquals(100,unitConverter.convertKilogramToGram(0.1));
	}
	
	@Test
	public void testAddGramWithKilogramAndConvertToGram() {
		Assert.assertEquals(1010,unitConverter.addGramWithKilogramAndConvertToGram(10, 1));
	}
	
	@Test
	public void testSubractGramFromKilogramAndConvertToKilogram() {
		Assert.assertEquals(1,unitConverter.subractGramFromKilogramAndConvertToKilogram(1.5,500));
	}
	
	@Test
	public void testConvertCelsiusToFahrenheit() {
		Assert.assertEquals(32,unitConverter.convertCelsiusToFahrenheit(0));
	}
	
	@Test
	public void testConvertKelvinToCelsius() {
		Assert.assertEquals(-273,unitConverter.convertKelvinToCelsius(0));
	}
}
