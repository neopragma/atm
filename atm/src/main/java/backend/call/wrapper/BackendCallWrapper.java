package backend.call.wrapper;

/**
 * Java wrapper for calling back-end applications via the customer's service bus. 
 * Provided for producers of client applications.
 */
public interface BackendCallWrapper {

	public abstract BackendResponse callAndWait(BackendFunction function, BackendRequest payload, double timeoutIntervalInMillis) 
			throws BackendCallException;
	
	public abstract void callAndForget(BackendFunction function, BackendRequest payload, BackendCallbackListener listener)
			throws BackendCallException;
	
}
