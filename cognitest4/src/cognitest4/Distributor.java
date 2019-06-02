package cognitest4;

public class Distributor extends Company {
	private String storageCapacity;
	private String minDistributionCount;
	private String maxDistributionCount;
	public String getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getMinDistributionCount() {
		return minDistributionCount;
	}
	public void setMinDistributionCount(String minDistributionCount) {
		this.minDistributionCount = minDistributionCount;
	}
	public String getMaxDistributionCount() {
		return maxDistributionCount;
	}
	public void setMaxDistributionCount(String maxDistributionCount) {
		this.maxDistributionCount = maxDistributionCount;
	}
	
	public Distributor(String code, String name, String address, String contactNumber) {
		super(code, name, address, contactNumber);
	}
	public Distributor(String code, String name, String address, String contactNumber, String storageCapacity,
			String minDistributionCount, String maxDistributionCount) {
		super(code, name, address, contactNumber);
		this.storageCapacity = storageCapacity;
		this.minDistributionCount = minDistributionCount;
		this.maxDistributionCount = maxDistributionCount;
	}
	public Distributor(String data) {
	}
	public void display() {
		super.display();
		System.out.println("Storage Capacity:"+this.getStorageCapacity()+" Minimum Distribution Count:"+this.getMinDistributionCount()+" Maximum Distribution Count:"+this.getMaxDistributionCount());
	}
}
