import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class JUnit_1 {
	String username;
	String password;
	@Test
	static void TestClass(String username, String password) {
		System.out.print("\nTEST CASE\n");
		assertEquals(password,"Pranay101");
		assertEquals(username,"Pranay_Ranjan");
	}
	static public void main(String[] args) {
		Scanner s=new Scanner(System.in);
		JUnit_1 obj=new JUnit_1();
		System.out.print("\nEnter Username:");
		obj.username=s.nextLine();
		System.out.print("\nEnter Password:");
		obj.password=s.nextLine();
		TestClass(obj.username,obj.password);
	}
}
