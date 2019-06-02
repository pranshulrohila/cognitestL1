package oopstest;

public class ManufacturerBO {
	FoodProduct fP[]=new FoodProduct[3];
	public boolean addFoodProduct(Manufacturer manufacturer,FoodProduct foodProduct) {
		if(manufacturer.getFoodProductsCount()<3) {
			fP[manufacturer.getFoodProductsCount()]=foodProduct;
			manufacturer.setFoodProduct(fP);
			return true;
		}
		else {
			System.out.println("Sorry food product limit for food product category has been reached!");
			System.exit(0);
			return false;
		}
	}
	public void displayFoodProduct(Manufacturer manufacturer) {
		for(int i=0;i<3;i++) {
			if(manufacturer.getFoodProduct()[i]==null) {
				break;
			}
			else {
				System.out.println(manufacturer.getFoodProduct()[i]);
			}
		}
	}
}
