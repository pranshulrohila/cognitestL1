package cognitest5;

public class MealCombo {
	private String name;
	private String manufacturer;
	private String intakeTime;
	private String intakeType;
	private int numberofItems;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getIntakeTime() {
		return intakeTime;
	}
	public void setIntakeTime(String intakeTime) {
		this.intakeTime = intakeTime;
	}
	public String getIntakeType() {
		return intakeType;
	}
	public void setIntakeType(String intakeType) {
		this.intakeType = intakeType;
	}
	public int getNumberofItems() {
		return numberofItems;
	}
	public void setNumberofItems(int numberofItems) {
		this.numberofItems = numberofItems;
	}
	public MealCombo(String name, String manufacturer, String intakeTime, String intakeType, int numberofItems) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.intakeTime = intakeTime;
		this.intakeType = intakeType;
		this.numberofItems = numberofItems;
	}
	public MealCombo() {
		super();
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-15s",this.getName(),this.getManufacturer(),this.getIntakeTime(),this.getIntakeType(),this.getNumberofItems());
	}
}
