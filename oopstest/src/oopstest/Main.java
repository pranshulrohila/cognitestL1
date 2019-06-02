package oopstest;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter food product category details");
		System.out.println("Name:");
		String name=br.readLine();
		System.out.println("Description:");
		Long weight=Long.parseLong(br.readLine());
		//System.out.println("Contact Number :");
		//long contactNumber=Long.parseLong(br.readLine());
		FoodProduct fp=new FoodProduct(name,weight);
		FoodProductBO mbo=new FoodProductBO();
		String ch;
		int count=0;
		do {
			System.out.println("Enter your choice:\n1)Add food product\n2)Display food product\n3)Exit");
			int menu=Integer.parseInt(br.readLine());
			switch(menu) {
			case 1:{
				System.out.println("Enter the food product details in CSV(Name,Weight in grams)");
				String details=br.readLine();
				String s[]=details.split(",");
				FoodProduct fp=new FoodProduct(s[0],s[1]);
				m.setFoodProductsCount(count++);
				mbo.addFoodProduct(m,fp);
				};break;
			case 2:{
				System.out.println("Name: "+m.getName());
				System.out.println("Address: "+m.getAddress());
				System.out.println("Contact Number: "+m.getContactNumber());
				System.out.printf("%-20s %-25s %-25s\n","Name","Category","Weight");
				mbo.displayFoodProduct(m);
			};break;
			case 3:System.exit(0);break;
			default: System.exit(0);
			}
			System.out.println("Do you want to continue?(yes/no)");
			ch=br.readLine();
		}while(ch.equals("yes"));
	}

}
