import java.sql.*;
public class prog3{
    public static void main(String[] args) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //conection between java and msaccess
	    
	    Connection con = DriverManager.getConnection("jdbc:odbc:msdb");
		if(con!=null) System.out.println(" con is okay!!");

 
            Statement stmt = con.createStatement();
		if(stmt!=null) System.out.println(" stmt is okay!!");
		

		int ra=stmt.executeUpdate("update room set mobile=mobile+1"); // executeUpdate() in table student
		System.out.println(" Row AFFECTED=\t"+ra);


                stmt.close();
                con.close();
            } // try block 

            catch (Exception err) {
                System.out.println("ERROR: " + err);
            }
    }

}


          
           