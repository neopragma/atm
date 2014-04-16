package backend.call.wrapper;

public class BackendCallWrapperImpl implements BackendCallWrapper {

	public void callAndForget(BackendFunction function, BackendRequest payload,
			BackendCallbackListener listener) throws BackendCallException {
		// TODO Auto-generated method stub

	}

	public BackendResponse callAndWait(BackendFunction function,
			BackendRequest payload, double timeoutIntervalInMillis)
			throws BackendCallException {
		// TODO Auto-generated method stub
		return new BackendResponse(CompletionCode.INDETERMINATE, null, null, null, null, null, null, null);
	}

}
