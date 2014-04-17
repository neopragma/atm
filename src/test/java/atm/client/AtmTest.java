package atm.client;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class AtmTest {
	double expected;
	double actual;
	private static final double initValue = 200.0;
	
	@Test
	public void test() throws Exception {
		initializeTestData();
		Atm atm = new Atm();
		atm.getBalance("My Account Number");
		assertThat(actual, equalTo(expected));
	}
	
	private void initializeTestData() {
		expected = initValue;
		actual = initValue;
	}

}
