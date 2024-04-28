import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		
		//loadig the dirvers
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create connection
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
				
		System.out.println(" data base connected");
		
		     
		    Statement smt= con.createStatement();
		
		
		       String q = "select empno,ename,sal from emp";
		       
		         ResultSet rs= smt.executeQuery(q);
		       
		         while(rs.next())
		         {
		        	 System.out.println(rs.getInt("empno") +" " + rs.getString("ename")+ " "+ rs.getFloat("SAL"));
		         }
		         
		         
		       
		
	}
	
	
}
