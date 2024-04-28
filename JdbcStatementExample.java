
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcStatementExample 
{

	//loadig the dirvers
	
			public static void main(String[] args) throws ClassNotFoundException, SQLException 
			{
			
				System.out.println("select");
				
				//loadig the dirvers
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				//get connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
				
				System.out.println("got connection");
				//create statement
				
				 Statement smt =con.createStatement();  
				//create query
				 
				String q = "select empno,ename,sal,deptno from emp where deptno = 30";
				
				//execute the query
			ResultSet rs=  smt.executeQuery(q);
				
				//iterate the result 
			
			   while(rs.next())
			   {
				   
				   System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+"  " + rs.getFloat(3) +" " + rs.getInt(4));				   
				   
			   }
			
			  
			   
			   
			   
			   System.out.println("update");
			   
			   
			   Statement smt1 =con.createStatement();
			   
			   
			   String q1 = "update emp set sal = sal +100 where deptno = 30";
			   
			   
			   	int nor =	smt1.executeUpdate(q1);
			   	
			   	System.out.println("no of record updated is "+ nor);
			   
			//close the connection
			   
			   rs.close();
				
			}
	
	
	
}
