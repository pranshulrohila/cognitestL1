package cognitest1;

public class FoodProduct {
	String name;
	String category;
	int weight;
	String nutrition;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNutrition() {
		return nutrition;
	}
	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}
	public FoodProduct() {
		super();
	}
	public FoodProduct(String name, String category, int weight, String nutrition) {
		super();
		this.name = name;
		this.category = category;
		this.weight = weight;
		this.nutrition = nutrition;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-10s %-10s\n",this.getName(),this.getCategory(),this.getWeight(),this.getNutrition());
	}
}
