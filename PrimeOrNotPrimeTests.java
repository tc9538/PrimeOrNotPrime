import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeOrNotPrimeTests {

	@Test
	void testNotPrime() 
	{
		Solution s = new Solution();
		assertEquals(s.PrimeOrNotPrime(1), "Not prime");
	}
	
	@Test
	void testPrime()
	{
		Solution s = new Solution();
		assertEquals(s.PrimeOrNotPrime(3), "Prime");
	}
	
	@Test
	void testNegativeInput()
	{
		Solution s = new Solution();
		assertEquals(s.PrimeOrNotPrime(-1), "Not prime");
	}

}
