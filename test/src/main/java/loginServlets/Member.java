package loginServlets;

public class Member {
	
	private int EID;
	private String eName;
	private String email;
	private double eBasicSalary;
	private String userName;
	private String password;
	private String gender;
	private String departmentID;
	private String contactNb;
	
	
	
	public Member(int eID, String eName, String email, double eBasicSalary, String userName,
			String password, String gender, String departmentID, String contactNb) {
		super();
		EID = eID;
		this.eName = eName;
		this.email = email;
		this.eBasicSalary = eBasicSalary;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.departmentID = departmentID;
		this.contactNb = contactNb;
	}



	public int getEID() {
		return EID;
	}



	public void setEID(int eID) {
		EID = eID;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double geteBasicSalary() {
		return eBasicSalary;
	}



	public void seteBasicSalary(double eBasicSalary) {
		this.eBasicSalary = eBasicSalary;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDepartmentID() {
		return departmentID;
	}



	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}



	public String getContactNb() {
		return contactNb;
	}



	public void setContactNb(String contactNb) {
		this.contactNb = contactNb;
	}
	
	

}
