import java.sql.*;
public class prog2{
    public static void main(String[] args) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //conection between java and msaccess
	    
	    Connection con = DriverManager.getConnection("jdbc:odbc:msdb");
		if(con!=null) System.out.println(" con is okay!!");

 
            Statement stmt = con.createStatement();
		if(stmt!=null) System.out.println(" stmt is okay!!");
		

		//stmt.execute("insert into room values(1,'Avinash',7060398484)"); // execute query in table student
		stmt.execute("select * from room"); // execute query in table student
		ResultSet rs = stmt.getResultSet(); // get any Result that came from our query


           // ResultSet rs = stmt.executeQuery("select * from room");

            if (rs != null)
             while ( rs.next() ){

                System.out.println("ID:" + rs.getString(1) + "\tName :"+rs.getString(2)+ "\tMobile "+rs.getString(3));
                }

                stmt.close();
                con.close();
            } // try block 

            catch (Exception err) {
                System.out.println("ERROR: " + err);
            }
    }

}


          
           