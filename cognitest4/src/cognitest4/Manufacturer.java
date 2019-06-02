package cognitest4;

public class Manufacturer extends Company{
	private String productionCapacity;
	private String minOrderQuantity;
	public String getProductionCapacity() {
		return productionCapacity;
	}
	public void setProductionCapacity(String productionCapacity) {
		this.productionCapacity = productionCapacity;
	}
	public String getMinOrderQuantity() {
		return minOrderQuantity;
	}
	public void setMinOrderQuantity(String minOrderQuantity) {
		this.minOrderQuantity = minOrderQuantity;
	}
	public Manufacturer(String code, String name, String address, String contactNumber, String productionCapacity,
			String minOrderQuantity) {
		super(code, name, address, contactNumber);
		this.productionCapacity = productionCapacity;
		this.minOrderQuantity = minOrderQuantity;
	}
	public Manufacturer(String code, String name, String address, String contactNumber) {
		super(code, name, address, contactNumber);
	}
	public Manufacturer(String data) {
	}
	public void display() {
		super.display();
		System.out.println("Production Capacity:"+this.getProductionCapacity()+" Minimum Order Quantity:"+this.getMinOrderQuantity());
	}
}
