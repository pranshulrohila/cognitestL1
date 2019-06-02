package oopstest;

public class Manufacturer {
	private String name;
	private String address;
	private long contactNumber;
	private FoodProduct foodProduct[]=new FoodProduct[3];
	private int foodProductsCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public FoodProduct[] getFoodProduct() {
		return foodProduct;
	}
	public void setFoodProduct(FoodProduct foodProduct[]) {
		this.foodProduct = foodProduct;
	}
	public int getFoodProductsCount() {
		return foodProductsCount;
	}
	public void setFoodProductsCount(int foodProductsCount) {
		this.foodProductsCount = foodProductsCount;
	}
	
	public Manufacturer() {
	}
	public Manufacturer(String name, String address, long contactNumber) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	
}
