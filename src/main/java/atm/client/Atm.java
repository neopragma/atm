package atm.client;

import backend.call.wrapper.BackendCallException;
import backend.call.wrapper.BackendCallWrapper;
import backend.call.wrapper.BackendCallWrapperImpl;
import backend.call.wrapper.BackendCallbackListener;
import backend.call.wrapper.BackendFunction;
import backend.call.wrapper.BackendRequest;
import backend.call.wrapper.BackendResponse;

@SuppressWarnings("unused")
public class Atm implements BackendCallbackListener {
	
	private static final BackendCallWrapper be = new BackendCallWrapperImpl();
	private BackendResponse res;
	private BackendCallbackListener listener;
	
	/**
	 * Allow injection of alternative callback listener.
	 */
	public void setBackendCallbackListener(BackendCallbackListener listener) {
		listener = listener;
	}
	
	/**
	 * Get balance
	 * 
	 * @param accountNumber
	 * @return balance
	 * @throws BackendCallException
	 */
	public Double getBalance(String accountNumber) throws BackendCallException {
		BackendRequest req = new BackendRequest();
		req.setAccountNumber1(accountNumber);
		BackendCallWrapper be = new BackendCallWrapperImpl();
		// Call back end asynchronously
		BackendResponse res = be.callAndWait(BackendFunction.ACCOUNT, req, 0);
		return res.getBalance();
	}

	@Override
	public void backendCallback(BackendResponse response) {
		this.res = response;
		
	}
	
}
