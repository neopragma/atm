package unittest.samples.auth;

public enum RequestType {
		PRE_AUTH     ("42"),
		POST_AUTH   ("43"),
		ECHO            ("11"),
		MAIL				 ("02");
		
		RequestType(String code) {
				this.code = code;
		}
		
		private final String code;
		public String code() {
				return code;
		}
}
