package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtility {
	static Connection con = null;

	static ResultSet rs = null;

	static Statement stmt = null;

	public static void getdata(String dburl, String username, String password) throws SQLException

	{

		con = DriverManager.getConnection(dburl, username, password);

		stmt = con.createStatement();



	}

	public static User getUserCredentials( String quesry) throws SQLException {
		User user = new User();
		rs = stmt.executeQuery(quesry);

		while (rs.next()) {

			String Username = rs.getString("Userame");
			user.setUseName(Username);
			System.out.println(Username);
			String pwd = rs.getString("Password");
			user.setPassword(pwd);

			System.out.println(pwd);

		}
         rs.close();
		return user;

	}

	public static Map getUserCredentialsMap() throws SQLException {
		Map<String, String> user = new HashMap<String, String>();

		while (rs.next()) {

			String Username = rs.getString("Userame");
			user.put("username", Username);
			// System.out.println(Username);

			String pwd = rs.getString("Password");
			user.put("password", pwd);
			// System.out.println(pwd);

		}

		return user;

	}

	
	/*
	 * public static Empinfo getempdetails() throws Exception { Empinfo emp = new
	 * Empinfo(); { while (rs.next()) { String empname = rs.getString("EmpName");
	 * emp.setEmpname(empname);
	 * 
	 * int empid = rs.getInt("EmpId"); emp.setEmpid(empid);
	 * 
	 * String emplocation = rs.getString("Location");
	 * emp.setEmplocation(emplocation);
	 * 
	 * int empage = rs.getInt("Age"); emp.setAge(empage); }
	 * 
	 * } return emp; }
	 */
	 

	
	public static List<Empinfo> getAllEmpDetails(String query) throws Exception
	{
		List<Empinfo> employees = new ArrayList<Empinfo>();
                
		rs = stmt.executeQuery(query);
			  while(rs.next())
			  {
				  Empinfo emp= new Empinfo();
				  String empname= rs.getString("EmpName");
				  emp.setEmpname(empname);
				  
				  int empid= rs.getInt("EmpId");
				  emp.setEmpid(empid);
				  
				  String emplocation= rs.getString("Location");
				  emp.setEmplocation(emplocation);
				  
				  int empage= rs.getInt("Age");
				  emp.setAge(empage);
				  
				  employees.add(emp);
			  }
			  rs.close();
			return employees;
		
	}
	
	public static List<User> getUsersCredentials(String query) throws Exception
	{
		List<User> allUsers= new ArrayList<User>();
		rs = stmt.executeQuery(query);
		
		while(rs.next())
			
		{
			User user= new User();
			
			String  username= rs.getString("Userame");
			user.setUseName(username);
			
			String pwd = rs.getString("Password");
			user.setPassword(pwd);
			allUsers.add(user);
			
		}
		rs.close();
		return allUsers;
		
	}

}
