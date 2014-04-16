package unittest.samples.auth.matchers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import unittest.samples.auth.RequestMessage;

public class ValidRequestMessage extends TypeSafeMatcher<RequestMessage> {

  @Override
  public boolean matchesSafely(RequestMessage request) {
		assertThat(request.messageString().length(), is(equalTo(65)));
		assertThat(request.messageString().substring(0,2), is(equalTo("42")));
		assertThat(request.messageString().substring(2, 12), is(equalTo(" 750146229")));
		assertThat(request.messageString().substring(12, 22), is(equalTo("corrtag123")));
		assertThat(request.messageString().substring(22, 38), is(equalTo("1111122222333334")));
		assertThat(request.messageString().substring(38, 48), is(equalTo("0000005534")));
		assertThat(request.messageString().substring(48, 51), is(equalTo("USD")));
		assertThat(request.messageString().substring(51, 65), is(equalTo("20150612142832")));
        return true;
  }

  public void describeTo(Description description) {
    description.appendText("RequestMessage is invalid");
  }

  @Factory
  public static <T> Matcher<RequestMessage> validRequestMessage() {
    return new ValidRequestMessage();
  }

}