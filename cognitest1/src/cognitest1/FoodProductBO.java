package cognitest1;

import java.util.*;

public class FoodProductBO {
	static int flag=0;
	public FoodProduct createFoodProduct(String details) {
		String d[]=details.split(",");
		FoodProduct fp=new FoodProduct(d[0],d[1],Integer.parseInt(d[2]),d[3]);
		return fp;
	}
	public void display(Map<String,List<FoodProduct>> foodProductMap,String nutritionName) {
		for(Map.Entry<String,List<FoodProduct>> m:foodProductMap.entrySet()){
			if(m.getKey().contains(nutritionName)) {
				System.out.println("Food Products");
				System.out.printf("%-15s%-15s%-10s%-10s\n","Name","Category","Weight","Nutrition");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("No nutrition found");
			System.exit(0);
		}
		for(Map.Entry<String,List<FoodProduct>> m:foodProductMap.entrySet()) {
			if(m.getKey().equals(nutritionName)){
				for(FoodProduct fp:m.getValue()) {
					System.out.printf("%-15s %-15s %-10s %-10s\n",fp.getName(),fp.getCategory(),fp.getWeight(),fp.getNutrition());
	    		}
			}
		}
	}
}
