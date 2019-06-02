package cognitest4;

	public class Company {
		private String code;
		private String name;
		private String address;
		private String contactNumber;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
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
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public Company(String code, String name, String address, String contactNumber) {
			super();
			this.code = code;
			this.name = name;
			this.address = address;
			this.contactNumber = contactNumber;
		}
		public Company() {
			super();
		}
		public Company(String data) {
			super();
		}
		public void display() {
			System.out.println(this.getCode()+","+this.getName()+","+this.getAddress()+","+this.getContactNumber());
		}
	}
