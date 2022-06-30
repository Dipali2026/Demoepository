package Test;

import java.sql.SQLException;
import java.util.List;

import Pages.Empinfo;
import Pages.JDBCUtility;

public class EmpinfoTest {

	public static void main(String[] args) throws Exception
	{
		String query= "select * from EmpInfo"  ;
		
		String Username="root" ;
		
		String password= "admin@123";
		
		String dburl="jdbc:mysql://localhost:3306/qadb";
	     
		JDBCUtility.getdata(dburl, Username, password);
		
	//	Empinfo emp=  JDBCUtility.getempdetails();
		
		//System.out.println(emp.getAge());
		//JDBCUtility.getAllEmpDetails();
		
		
	//System.out.println(JDBCUtility.getAllEmpDetails());
	
	 int count = JDBCUtility.getAllEmpDetails(query).size();
	 System.out.println(count);
	 
	 System.out.println(JDBCUtility.getAllEmpDetails(query));
	 

	 
	// for(int i=0;i>count ;i++)
	// {
	//	 System.out.println(JDBCUtility.getAllEmpDetails().get(i).getEmpname());
	// }

	}

}
