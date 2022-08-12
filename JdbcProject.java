import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcProject 
{
	public static void main(String[] args)throws Exception 
	{
		String url= "jdbc:mysql://localhost:3306/jdbc_demo";
		String uname= "root";
		String password="Kiran@12345";
		String query ="Select name from jadbc_demo.users where id=1";
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Sachin");
		
		
//		Connection con =DriverManager.getConnection(url,uname,password);
//		Statement st = con.createStatement();
//		ResultSet rs =st.executeQuery(query);
//		
//		rs.next();
//		String Name =rs.getString("name");
//		
//		System.out.println(Name);
//		
//		st.close();
//		con.close();
	}
}
