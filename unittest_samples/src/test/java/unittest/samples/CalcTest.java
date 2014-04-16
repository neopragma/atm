package unittest.samples;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
	
	@Spy private Calc calc = new Calc();
	@Captor ArgumentCaptor<Double> captor1;
	@Captor ArgumentCaptor<Double> captor2;
	
	@Test
	public void it_adds_two_numbers() throws Exception {
		calc.enter("5");
		calc.enter("2.5");
		calc.enter("+");
		assertThat(calc.enter("r"), is(equalTo("7.5")));
		verify(calc).add(captor1.capture(), captor2.capture());
		assertThat(captor1.getValue(), is(closeTo(2.5, 0.05)));
		assertThat(captor2.getValue(), is(closeTo(5.0, 0.05)));
	}
	
	

}
