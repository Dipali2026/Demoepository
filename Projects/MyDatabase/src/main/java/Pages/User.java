package Pages;

public class User {

	private String useName;
	private String password;
	
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [useName=" + useName + ", password=" + password + "]";
	}
	
	
	
	

}
