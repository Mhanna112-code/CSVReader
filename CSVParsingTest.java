import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import CSVParsing.java
import org.junit.jupiter.api.Test;

class CSVParsingTest {

	
	@Test
	void test() {
		CSVParsing CSVParsing = new CSVParsing();
		String derp = CSVParsing.readDataLineByLine("Data3.csv");
		assertEquals(derp, "name rollno department result cgpa pratik 65 cse pass 7.2 raunak 23 me pass 9.1");
		fail("Not yet implemented");
	}

}
