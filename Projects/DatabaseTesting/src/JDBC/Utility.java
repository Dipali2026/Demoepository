package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility 
{
	
	static Connection con =null ;
	
	static ResultSet rs= null;
	
	static Statement stmt =null;
	
	public static void getdata( String dburl, String username, String password ,String quesry) throws SQLException
	
	{

		
		
	  con =	DriverManager.getConnection(dburl,username, password );
	

       stmt= con.createStatement();
    
     rs= stmt.executeQuery(quesry);
    
    while(rs.next())
    {
    
        String EmpID =  rs.getString("EmpId");
  
        String Location= rs.getString("Location");
  
          System.out.println(EmpID);
  
         System.out.println(Location);
  
    
      }
	}


}
