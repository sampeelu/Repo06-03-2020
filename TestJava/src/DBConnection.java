import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("NAME");
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/samyak123@localhost");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from test");  
		while(rs.next()){  
			System.out.println(rs.getString("age"));
		
	}
}}
