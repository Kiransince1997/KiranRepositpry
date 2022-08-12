import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDriver 
{
	public static void main(String[] args) 
	{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false","root","Kiran@12345");
			Statement st =con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Jdbc_demo.users");)
		{
			while(rs.next())
			{
				int id = rs.getInt("id");
				String Name = rs.getString("name");
				String Email = rs.getString("email");
				String Country =rs.getString("country");
				String Password =rs.getString("password");
				System.out.println(id+","+Name+","+Email+","+Country+","+Password);
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
