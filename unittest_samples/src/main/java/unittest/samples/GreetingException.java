package unittest.samples;

public class GreetingException extends Exception {
		private static final long serialVersionUID = 1L;
		private String message = null;
		private Throwable wrappedThrowable = null;
	
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Throwable getWrappedThrowable() {
			return wrappedThrowable;
		}

		public void setWrappedThrowable(Throwable wrappedThrowable) {
			this.wrappedThrowable = wrappedThrowable;
		}

		public GreetingException(String message, Throwable wrappedThrowable) {
			this.message = message;
			this.wrappedThrowable = wrappedThrowable;
	  }

}
