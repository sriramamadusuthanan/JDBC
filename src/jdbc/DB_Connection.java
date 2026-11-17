package jdbc;

import java.sql.*;

public class DB_Connection {

	public static void main(String[] args) throws Exception {
		// loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//making the connection
		Connection conobj= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sys","root","root");
		if(conobj!=null)
		{
			System.out.println("DB connected");
		}
		//both loading and making connection is same for all jdbc connection
		
		//create a table in mysql then
		//we will add values from java cls from here 
		 Statement statObj = conobj.createStatement();
		 //executeUpdate for insert,update,delete
		 //executeQuery for select
		 statObj.executeUpdate("insert into emp(ename,job,salary) value(\"sri\",\"developer\",1000);");
		 System.out.println("employee added");
		 
		 // add the data from a dynamic source not a fixed qurey
		 String name = "ajay";
		 int sal =2000;
		 String job="hr";
		 String query="insert into emp(ename,job,salary) value('" + name+"','" + job+"',"+sal +");";
		 statObj.executeUpdate(query);
	}

}
