import org.junit.Test;
import org.junit.Assert;

public class Tester {
	
	@Test
	public void testIp() {
		Assert.assertEquals(false,IpValidator.isValid("192.168.1.1"));
	}

	
	@Test
	public void testIp1() {
		Assert.assertEquals(false,IpValidator.isValid("a.b.a.a"));
	}
	
	@Test
	public void testIp2() {
		Assert.assertEquals(true,IpValidator.isValid("1.1.1.1"));
	}
	
	@Test
	public void testIp3() {
		Assert.assertEquals(false,IpValidator.isValid("192.255.0.0"));
	}
	
	@Test
	public void testIp4() {
		Assert.assertEquals(false,IpValidator.isValid("255.255.255.255"));
	}
	
	@Test
	public void testIp5() {
		Assert.assertEquals(false,IpValidator.isValid("365.1.456.30"));
	}

}
