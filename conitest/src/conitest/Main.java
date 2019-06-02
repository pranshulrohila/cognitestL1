package conitest;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of food product");
		int n=Integer.parseInt(br.readLine());
		String details[]=new String[n];
		for(int i=0;i<n;i++) {
			details[i]=br.readLine();
		}
		for(int i=0;i<n;i++) {
			String s[]=details[i].split(",");
			if(s[0].startsWith("FP")) {
				FoodProduct fp=new FoodProduct(s[0],s[1],s[2],s[3]);
				System.out.print(i+1+". ");
				fp.display();
			}
			else if(s[0].startsWith("PFP")) {
				PreservatedFoodProduct pfp=new PreservatedFoodProduct(s[0],s[1],s[2],s[3],s[4],s[5]);
				System.out.print(i+1+". ");
				pfp.display();
			}
		}
	}

}
