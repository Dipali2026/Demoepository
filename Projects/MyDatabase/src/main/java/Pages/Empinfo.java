package Pages;

public class Empinfo 
{
private String empname;
	
	private int empid;
	
	private String emplocation ;
	
	private int age;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmplocation() {
		return emplocation;
	}

	public void setEmplocation(String emplocation) {
		this.emplocation = emplocation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Empinfo [empname=" + empname + ", empid=" + empid + ", emplocation=" + emplocation + ", age=" + age
				+ "]";
	}



}
