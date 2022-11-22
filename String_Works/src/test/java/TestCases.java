import static org.junit.Assert.*;

import org.junit.Test;

import my.StringWorks.StringWork;

public class TestCases {
	StringWork obj=new StringWork();
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		
		String[] actual1=obj.splitter("Pranay Ranjan");
		String[] expected1=new String[] {"Pranay","Ranjan"};
		Splitter(actual1, expected1);
		
	}
	
	@Test
	public void test2() {
		String actual2=obj.truncater("HamBurger", 3);
		String expected2="Burger";
		Truncater(expected2,actual2);
		
	}

	private void Splitter(String[] actual1, String[] expected1) {
		assertEquals(expected1,actual1);
	}
	
	private void Truncater(String expected2, String actual2) {
		assertEquals(expected2,actual2);
	}
	
	
	

}
