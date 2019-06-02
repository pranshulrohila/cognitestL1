package conitest;

public class FoodProduct {
	String name;
	String category;
	String manufacturer;
	String weight;
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public FoodProduct(String name, String category, String manufacturer, String weight) {
		super();
		this.name = name;
		this.category = category;
		this.manufacturer = manufacturer;
		this.weight = weight;
	}
	public FoodProduct() {}
	public void display() {
		System.out.println(this.getName()+","+this.getCategory()+","+this.getManufacturer()+","+this.getWeight());
	}
}
