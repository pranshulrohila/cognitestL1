import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreanReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		AccountBO abo=new AccountBO();
		do {
			System.out.println("Enter the employee details");
			abo.addAccountDetails(br.readLine());
			System.out.println("Do you want to add another?(Yes/No)");
			String checker=br.readLine();
		}while(checker.equals("Yes"));
		
	}

}
