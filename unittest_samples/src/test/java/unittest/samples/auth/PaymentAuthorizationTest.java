package unittest.samples.auth;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import static unittest.samples.auth.matchers.ValidRequestMessage.validRequestMessage;

public class PaymentAuthorizationTest {
	
		private RequestMessage request;
		
		@Before
		public void before_each_test_case() throws Exception {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, 2015);
			cal.set(Calendar.MONTH, 5);
			cal.set(Calendar.DAY_OF_MONTH, 12);
			cal.set(Calendar.HOUR_OF_DAY, 14);
			cal.set(Calendar.MINUTE, 28);
			cal.set(Calendar.SECOND, 32);
		
			request = new RequestMessage(
					RequestType.PRE_AUTH,
					new LocationCode("750146229"),
					"corrtag123",
					new AccountNumber("1111122222333334"),
					new FormattedAmount("5534"),
					"USD",
					cal.getTime());				
			
			System.out.println(request.messageString());
			
		}
	
		@Test
		public void pre_auth_message_has_valid_format_multiple_assertions() throws Exception {
				assertThat(request.messageString().length(), is(equalTo(65)));
				assertThat(request.messageString().substring(0,2), is(equalTo("42")));
				assertThat(request.messageString().substring(2, 12), is(equalTo(" 750146229")));
				assertThat(request.messageString().substring(12, 22), is(equalTo("corrtag123")));
				assertThat(request.messageString().substring(22, 38), is(equalTo("1111122222333334")));
				assertThat(request.messageString().substring(38, 48), is(equalTo("0000005534")));
				assertThat(request.messageString().substring(48, 51), is(equalTo("USD")));
				assertThat(request.messageString().substring(51, 65), is(equalTo("20150612142832")));
		}
		
		@Test
		public void pre_auth_message_has_valid_format_assertion_method() throws Exception {
				assertValidRequestMessage(request);
		}
		
		@Test
		public void pre_auth_message_has_valid_format_custom_matcher() throws Exception {
				assertThat(request, is(validRequestMessage()));
		}
		
		private void assertValidRequestMessage(RequestMessage request) throws Exception {
			assertThat(request.messageString().length(), is(equalTo(65)));
			assertThat(request.messageString().substring(0,2), is(equalTo("42")));
			assertThat(request.messageString().substring(2, 12), is(equalTo(" 750146229")));
			assertThat(request.messageString().substring(12, 22), is(equalTo("corrtag123")));
			assertThat(request.messageString().substring(22, 38), is(equalTo("1111122222333334")));
			assertThat(request.messageString().substring(38, 48), is(equalTo("0000005534")));
			assertThat(request.messageString().substring(48, 51), is(equalTo("USD")));
			assertThat(request.messageString().substring(51, 65), is(equalTo("20150612142832")));			
		}

}
