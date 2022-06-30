package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Jdbcconnection {

	public static void main(String[] args) throws Exception 
	{
		String host ="localhost";
		String port = "3306";
		
	//	String sql="select * from EmpInfo where EmpName="Asha\"";
	 
		Connection con=	DriverManager.getConnection("jdbc:mysql://"+ host +":"+port+ "/qadb","root", "admin@123");

	       Statement stmt= con.createStatement();
	       
	       ResultSet rs= stmt.executeQuery("select * from EmpInfo where EmpName='Asha'");
	       
	       while(rs.next())
	       {
	       
	     String EmpID =  rs.getString("EmpId");
	     
	     String Location= rs.getString("Location");
	     
	     System.out.println(EmpID);
	     
	     System.out.println(Location);
	     
	       }
	       
	     ResultSet rs1= stmt.executeQuery("select * from EmpInfo where EmpName='Akansha'");
	     
	     while(rs1.next())
	     {
	     
	     
	     String Empid=  rs1.getString("EmpID");
	     
	     System.out.println(Empid);
	     }
	     
	     
	}

}
