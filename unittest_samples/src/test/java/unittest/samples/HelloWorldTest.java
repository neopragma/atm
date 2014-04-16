package unittest.samples;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
//import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	
	private final static String HELLO = "hello";
	private final static String GOOD_MORNING = "good.morning";
	
	private Greeter greeter;
	private Locale in_Italian = new Locale("it");
	
	@Before
	public void before_each_test_method() throws Exception {
			greeter = new Greeter();
	}

	// Standard style assertions
	
	@Test
	public void it_says_hello_in_the_default_language() throws Exception {
			assertEquals("Hello, world!", greeter.say(HELLO));
	}
	
	@Test
	public void it_says_good_morning_in_the_default_language() throws Exception {
			assertEquals("Good morning!", greeter.say(GOOD_MORNING));
	}
	
	@Test
	public void it_says_hello_in_italian() throws Exception {
			assertEquals("Ciao, mondo!", greeter.say(HELLO, in_Italian));
	}
	
	@Test
	public void it_says_good_morning_in_italian() throws Exception {
			assertEquals("Buon giorno!", greeter.say(GOOD_MORNING, in_Italian));
	}
	
	@Test
	public void it_says_good_morning_in_italian_with_error_text() throws Exception {
			assertEquals("Mamma mia, mi aspettavo italiano!", "Buon giorno!", greeter.say(GOOD_MORNING, in_Italian));
	}

	// Hamcrest style assertions
	
	@Test
	public void it_says_hello_in_the_default_language_hamcrest_style() throws Exception {
			assertThat(greeter.say(HELLO), is(equalTo("Hello, world!")));
	}
	
	@Test
	public void it_says_good_morning_in_the_default_language_hamcrest_style() throws Exception {
			assertThat(greeter.say(GOOD_MORNING), is(equalTo("Good morning!")));
	}
	@Test
	public void it_says_hello_in_italian_hamcrest_style() throws Exception {
			assertThat(greeter.say(HELLO, in_Italian), is(equalTo("Ciao, mondo!")));
	}
	
	@Test
	public void it_says_good_morning_in_italian_hamcrest_style() throws Exception {
			assertThat(greeter.say(GOOD_MORNING, in_Italian), is(equalTo("Buon giorno!")));
	}
	
	@Test
	public void it_matches_the_greeting_regardless_of_case() throws Exception {
			assertThat(greeter.say(HELLO), is(equalToIgnoringCase("hEllO, WorLD!")));
	}
	
	@Test
	public void it_matches_the_greeting_regardless_of_whitespace() throws Exception {
			assertThat(greeter.say(HELLO), is(equalToIgnoringWhiteSpace("Hello,\n    world!")));
	}

}
