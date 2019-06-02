package cognitest5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the meal combo details");
		String ds=br.readLine();
		MealCombo mc=new MealCombo();
		String s[]=ds.split(",");
		mc.setName(s[0]);
		mc.setManufacturer(s[1]);
		mc.setIntakeTime(s[2]);
		mc.setIntakeType(s[3]);
		mc.setNumberofItems(Integer.parseInt(s[4]));
		System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Name","Manufacturer","Intake Time","Intake Type","Number of Items");
		System.out.println(mc);
	}

}
