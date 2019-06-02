package conitest;

public class PreservatedFoodProduct extends FoodProduct{
	private String preservatedType;
	private String expiryDate;
	public String getPreservatedType() {
		return preservatedType;
	}
	public void setPreservatedType(String preservatedType) {
		this.preservatedType = preservatedType;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public PreservatedFoodProduct(String name, String category, String manufacturer, String weight,
			String preservatedType, String expiryDate) {
		super(name, category, manufacturer, weight);
		this.preservatedType = preservatedType;
		this.expiryDate = expiryDate;
	}
	public PreservatedFoodProduct() {}
	public PreservatedFoodProduct(String data) {
	}
	public void display() {
		System.out.println(this.getName()+","+this.getCategory()+","+this.getManufacturer()+","+this.getWeight());
		System.out.println("Preservated Type:"+this.getPreservatedType()+" Expiry Date:"+this.getExpiryDate());
	}
}
