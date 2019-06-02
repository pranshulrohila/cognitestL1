package cognitest2;

public class FitnessProgram implements Comparable<FitnessProgram> {
	private int id;
	private String name;
	private String description;
	private String fitnessCenter;
	private String duration;
	private long cost;
	private int days;
	public int compareTo(FitnessProgram obj) {
		 if (this.getDays() == obj.getDays()) return 0;
	     else if (this.getDays() < obj.getDays()) return -1;
	     else return 1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getFitnessCenter() {
		return fitnessCenter;
	}
	public void setFitnessCenter(String fitnessCenter) {
		this.fitnessCenter = fitnessCenter;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getDays() {
		return days;
	}
	public void setDays(String dur) {
		int days;
		if(dur.contains("Months")) {
			days=Integer.parseInt(dur.split(" ")[0])*30;
		}else {
			days=Integer.parseInt(dur.split(" ")[0])*7;
		}
		this.days = days;
	}
	
	public FitnessProgram(int id, String name, long cost, String duration, String description, String fitnessCenter) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.duration = duration;
		this.description = description;
		this.fitnessCenter = fitnessCenter;
	}
	public FitnessProgram() {}
	public String toString() {
		return String.format("\n%-20s %-15s %-20s %-20s %s\n","Name","Duration","Description","FitnessCenter","Cost");
	}
}
