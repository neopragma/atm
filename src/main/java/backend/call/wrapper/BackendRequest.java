package backend.call.wrapper;

/**
 * Data to pass to the back-end system.
 */
public class BackendRequest {
	private String accountNumber1 = null;
	private String accountNumber2 = null;
	private Double amount = null;
	private Integer transactionId = null;

	public String getAccountNumber1() {
		return accountNumber1;
	}
	public void setAccountNumber1(String accountNumber1) {
		this.accountNumber1 = accountNumber1;
	}
	public String getAccountNumber2() {
		return accountNumber2;
	}
	public void setAccountNumber2(String accountNumber2) {
		this.accountNumber2 = accountNumber2;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
}