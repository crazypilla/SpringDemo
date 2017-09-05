// POJO/ Bean/no business logic as such
public class Employee {

		int eid;
		String ename;
		Address address;
		char gender;
	public Employee(){
		
	}
	
	public Employee(int eid, String ename,char gender) {
		super();
		this.eid = eid;
		this.ename = ename;
		//this.address = address;
		this.gender = gender;
	}
	public Employee(Address address)
	{
		this.address=address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", gender=" + gender + "]";
	}

	public void myInit(){
		System.out.println("initialising..");
	}
	public void myDestroy()
	{
		System.out.println("destroying...");
	}
	

}
