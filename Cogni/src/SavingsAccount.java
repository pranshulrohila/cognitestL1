
public class SavingsAccount extends Account {
	String holderName;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public void calculateIntrest() {
		float im=(amount*(2/100));
		System.out.printf("Savings : %s, %s, %0.1f, %0.1f\n",accNo,holderName,amount,im);
	}
}
