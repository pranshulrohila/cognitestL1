package cognitest1;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of food product");
		int n=Integer.parseInt(br.readLine());
		String detail[]=new String[n];
		System.out.println("Enter the food product details");
		for(int i=0;i<n;i++) {
			detail[i]=br.readLine();
		}
		FoodProductBO fpbo=new FoodProductBO();
		List<FoodProduct> lfp=new ArrayList<FoodProduct>();
		for(int i=0;i<n;i++) {
			lfp.add(fpbo.createFoodProduct(detail[i]));
		}
		Map<String,List<FoodProduct>> map=new HashMap<String,List<FoodProduct>>();
		for(int i=0;i<lfp.size();i++) {
			List<FoodProduct> lfp1=new ArrayList<FoodProduct>();
			for(int j=0;j<lfp.size();j++) {
				if(lfp.get(i).getNutrition().equals(lfp.get(j).getNutrition())) {
					lfp1.add(lfp.get(j));
				}
			}
			map.put(lfp.get(i).getNutrition(), lfp1);
		}
		System.out.println("Enter the nutrition name");
		String nn=br.readLine();
		fpbo.display(map, nn);
	}
}
