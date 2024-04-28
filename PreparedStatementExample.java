import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{

//	createconnection()
//	selectempdata()
//	updateempsal()
//	deleteempno()
//	
	PreparedStatement pmt;
	String q;
	System.out.println("select using prepared statement");
	Scanner sc;
	//loadig the dirvers
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	//get connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
	
	System.out.println("got connection");
	
	q = "select empno,ename,sal,deptno from emp where deptno = ? and sal>?";
	 pmt =con.prepareStatement(q);
	 sc = new Scanner(System.in);
	System.out.println("enter the dno");
	int dno = sc.nextInt();
	pmt.setInt(1, dno);
	System.out.println("enter the sal?>");
	int sa = sc.nextInt();
	pmt.setInt(2, sa);
	
	ResultSet rs	=pmt.executeQuery();
	
	
	while(rs.next())
	   {
		   
		   System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+"  " + rs.getFloat(3) +" " + rs.getInt(4));				   
		   
	   }
	
	//delete using prepared statement
	
	
//	q = "delete from emp where empno = ?";
//	pmt =con.prepareStatement(q);
//	System.out.println("enter the dno");
//	int eno = sc.nextInt();
//	pmt.setInt(1, eno);
//	int no=pmt.executeUpdate();
//	System.out.println("no of employee deleted  "+no);
	
	
	//insert  using prepared statement
	
	q = "insert into emp(empno,ename,sal) values(? ,?, ?)";
	
	pmt =con.prepareStatement(q);
	System.out.println("enter the empno");
	int eno = sc.nextInt();
	 System.out.println("enter the name");
	 String name = sc.next();
	 System.out.println("enter the sal");
	 float amt = sc.nextFloat();
	pmt.setInt(1, eno);
	pmt.setString(2, name);
	pmt.setFloat(3, amt);
	
	int no=pmt.executeUpdate();
	System.out.println("no of record inserted "+no);
	
	
	
	
	
	
	
	
	//close the connection
	   
	   rs.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
