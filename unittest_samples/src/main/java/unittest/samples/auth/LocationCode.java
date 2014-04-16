package unittest.samples.auth;

public class LocationCode {
		private String value;
		
		public LocationCode(String value) {
				this.value = value;
		}
		
		public String asString() {
			return String.format("%10s", value);
		}

}
