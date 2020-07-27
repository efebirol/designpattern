/**
 * 
 */
package singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author knoppix
 *
 */
public class SingletonServiceTest {

	/**
	 * Test method for {@link singleton.SingletonService#getInstance()}.
	 */
	@Test
	@DisplayName("testGetInstance")
	@Tag ("instantiate")
	public void testGetInstance() {
		//AAA: "arrange" ->  "act" -> "assert"
		String expectedResult = "Mcleod says: There can only be one!";
		
		//erzeuge die Instance einmal
		SingletonService mcleod = SingletonService.getInstance();
		
		SingletonService seanconnery= SingletonService.getInstance();
		
		
		assertEquals(expectedResult, mcleod.saySomething());

	}

}
