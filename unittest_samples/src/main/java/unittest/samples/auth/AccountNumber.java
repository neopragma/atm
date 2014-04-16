package unittest.samples.auth;

public class AccountNumber {
		private String value;
		
		public AccountNumber(String value) {
				this.value = value;
		}
		
		public String asString() {
			return String.format("%16s", value);
		}

}
