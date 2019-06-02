
public class AccountBO {
	public void addAccountDetail(String details) {
		String s=details.split(",");
		int i=0;
		if(s[3].euqals("C")) {
			CreditAccount ca=new CreditAccount();
			ca.setAccNo(s[0]);
			ca.setHolderName(s[1]);
			ca.setAmount(Float.parseFloat(s[2]));
			ca.accounts[i++]=ca;
		}
		else if(s[3].equals("S")) {
			SavingsAccount sa=new SavingsAccount();
			sa.setAccNo(s[0]);
			sa.setHolderName(s[1]);
			sa.setAmount(Float.parseFloat(s[2]));
			sa.accounts[i++]=sa;
		}
		else {
			System.exit(0);
		}
	}
}
