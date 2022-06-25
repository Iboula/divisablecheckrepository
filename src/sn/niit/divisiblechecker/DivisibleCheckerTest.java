package sn.niit.divisiblechecker;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivisibleCheckerTest {
	
	@Test
    void shouldTestAddElement() {
        final DivisibleChecker firstTest = new DivisibleChecker();
        //final Element secondElement = new Element(7);

        //final Element resultElement = firstElement.add(secondElement);
        assertEquals(firstTest.isDivisible(5, 2), true);
    }
}
