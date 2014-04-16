package backend.call.wrapper;

/**
 * Data returned from back-end
 */
public class BackendResponse {
	private CompletionCode result = null;
	private String accountNumber1 = null;
	private String accountNumber2 = null;
	private Double balance = null;
	private String customerId = null;
	private AccountStatus accountStatus = null;
	private String notes = null;
	private Integer transactionId;

	public BackendResponse(
			CompletionCode result,
			String accountNumber1, 
			String accountNumber2,
			AccountStatus accountStatus, 
			Double balance, 
			String customerId,
			String notes,
			Integer transactionId) {
		super();
		this.accountNumber1 = accountNumber1;
		this.accountNumber2 = accountNumber2;
		this.accountStatus = accountStatus;
		this.balance = balance;
		this.customerId = customerId;
		this.notes = notes;
		this.result = result;
		this.transactionId = transactionId;
	}
	public CompletionCode getResult() {
		return result;
	}
	public String getAccountNumber1() {
		return accountNumber1;
	}
	public String getAccountNumber2() {
		return accountNumber2;
	}
	public Double getBalance() {
		return balance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	public String getNotes() {
		return notes;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
}
