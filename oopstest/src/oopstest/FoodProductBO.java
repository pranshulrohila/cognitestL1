package oopstest;

public class FoodProductBO {
	public boolean addFoodProduct(FoodProductCategory foodProductCategory,FoodProduct foodProduct) {
		if(.getFoodProductsCount()<3) {
			fP[manufacturer.getFoodProductsCount()]=foodProduct;
			manufacturer.setFoodProduct(fP);
			return true;
		}
		else {
			System.out.println("Food Product Count Exceeded");
			System.exit(0);
			return false;
		}
	}
	public void displayFoodProduct(FoodProductCategory category) {
		
	}
}
