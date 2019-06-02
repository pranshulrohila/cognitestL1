package Cogni/src;


public class CreditAccount extends Account {
	String holderName;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public void calculateIntrest() {
		float im=(amount*(3/100));
		System.out.printf("Credit : %s, %s, %0.1f, %0.1f\n",accNo,holderName,amount,im);
	}
}
