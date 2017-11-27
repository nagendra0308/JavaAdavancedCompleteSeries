import java.sql.*;
public class prog19{
	public static void main(String args[]){
	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:mysqldb");
	Statement stmt=con.createStatement();
	stmt.execute("select *from class");
	ResultSet rs=stmt.getResultSet();
	if(rs!=null)
	while(rs.next())
	System.out.println("ID:" + rs.getString(1) + "\tName :"+rs.getString(2)+ "\tMobile "+rs.getString(3));
	
        stmt.close();
	con.close();
	}
	catch(Exception e){

		}
	}
}
	
