package pranay.StringGames;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_op_tester {

	@Test
	public void test() {
		String_OP obj=new String_OP();
		String[] actual=obj.abbrebiator("Pranay Ranjan");
		String[] expected=new String[] {"Pranay","Ranjan"};
		extracted(actual, expected);
	}

	@SuppressWarnings("deprecation")
	private void extracted(String[] actual, String[] expected) {
		assertEquals(expected,actual);
	}

}
