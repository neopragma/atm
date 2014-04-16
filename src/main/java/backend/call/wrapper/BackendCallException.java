package backend.call.wrapper;

/**
 * Base exception type for the back-end call wrapper.
 */
public class BackendCallException extends Exception {
	
	private static final long serialVersionUID = -7602483296208712143L;
	private Throwable wrappedException;
	private String message;
	
	public BackendCallException(String message, Throwable wrappedException) {
		this.wrappedException = wrappedException;
		this.message = message;
	}
	
	public BackendCallException(Throwable wrappedException) {
		this("", wrappedException);
	}
	
	public BackendCallException(String message) {
		this(message, null);
	}
	
	public BackendCallException() {
		this(null, null);
	}

	public String getMessage() {
		return message;
	}
	
	public Throwable getWrappedException() {
		return wrappedException;
	}

}
