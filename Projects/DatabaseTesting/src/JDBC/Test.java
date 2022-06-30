
package JDBC;

import java.sql.SQLException;

public class Test 
{
	//static String url = "jdbc:mysql://localhost:3306/qadb";
	
	
	
	public static void main(String[] args) throws SQLException
	{
		Utility.getdata("jdbc:mysql://localhost:3306/qadb", "root", "admin@123", "select * from EmpInfo where EmpName='Asha' ");
	     
		
	}
}
