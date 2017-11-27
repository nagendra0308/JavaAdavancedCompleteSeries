import java.sql.*;
import java.util.*;

public class prog20{
	public static void main(String args[])throws Exception {

	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql:///java","root","nagendra");
	Statement stmt=con.createStatement();
	stmt.execute("select *from class");
	ResultSet rs=stmt.getResultSet();
	if(rs!=null)
	while(rs.next())
	System.out.println("ID:" + rs.getString(1) + "\tName :"+rs.getString(2)+ "\tMobile "+rs.getString(3));
	
        stmt.close();
	con.close();
	
	}
}
	
