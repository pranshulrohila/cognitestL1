package oopstest;

public class FoodProduct {
	private String name;
	//private String category;
	private long weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}*/
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public FoodProduct() {
	}
	public FoodProduct(String name, long weight) {
		this.name = name;
		//this.category = category;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-25s\n",name,weight);
	}
}
