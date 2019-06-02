package cognitest0;

public class User {
	private int id;
	private String dob;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public User(int id, String dob, int salary) {
		super();
		this.id = id;
		this.dob = dob;
		this.salary = salary;
	}
	public User() {}
}
