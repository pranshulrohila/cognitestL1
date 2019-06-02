
public abstract class Account {
	String accNo;
	float amount;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	static final int intrestForSaving = 2;
	static final int intrestForCredit = 3;
	static Account accounts[] = new Accounts[10];

	abstract void calculateIntrest();
}
