package atm.client;

import backend.call.wrapper.BackendCallException;
import backend.call.wrapper.BackendCallWrapper;
import backend.call.wrapper.BackendCallWrapperImpl;
import backend.call.wrapper.BackendFunction;
import backend.call.wrapper.BackendRequest;
import backend.call.wrapper.BackendResponse;

public class Atm {

	public Double getBalance(String accountNumber) throws BackendCallException {
		BackendRequest req = new BackendRequest();
		req.setAccountNumber1(accountNumber);
		BackendCallWrapper be = new BackendCallWrapperImpl();
		BackendResponse res = be.callAndWait(BackendFunction.ACCOUNT, req, 0);
		return res.getBalance();
	}
	
	
}
