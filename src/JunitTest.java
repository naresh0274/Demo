import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		Junit J1=new Junit();
		System.out.println("Hello to unittesting ");
		int result=J1.sum(5,2);
		assertEquals(7,result);
		
	}

}
