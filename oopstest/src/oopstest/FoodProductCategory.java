package oopstest;

public class FoodProductCategory {
	private String name;
	private String description;
	private FoodProduct[ ] foodProduct=new FoodProduct[3];
	private int productCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public FoodProduct[] getFoodProduct() {
		return foodProduct;
	}
	public void setFoodProduct(FoodProduct[] foodProduct) {
		this.foodProduct = foodProduct;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public FoodProductCategory() {
		super();
	}
	public FoodProductCategory(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
}
