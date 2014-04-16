package unittest.samples.auth;

public class FormattedAmount {
		private String value;
		
		public FormattedAmount(String value) {
				this.value = value;
		}
		
		public String asString() {
			return String.format("%010d", Integer.parseInt(value));
		}

}
