//  STEP:1 Importing the packages
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {



        String sql = "select sname from student where sid=2";


//     STEP:2   loading and registering the driver (Not Important)
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            System.err.println("Could not load postgresql.Driver");
        }

//      STEP:3  creating connection (Connection means, connecting the application to the DB)
        Connection con = DriverManager.getConnection(url,uname,pass); // here 'Connection' is interface hence using 'getConnection', it provides implementation details for interface i.e 'Connection
        // 'getConnection' asks for 3 parameters
        System.out.println("Connected to database successfully");

//        STEP:4 Creating Statement.
        Statement st = con.createStatement();

//        STEP:5 Executing Statement
        ResultSet rs = st.executeQuery(sql); /* ".execute" is used when you want to change any data in the DB tabel
                          ".executeQuery" is used for basic data fetching from table
                          ResultSet is an interface and it is used to store the output got from "st.executeQuery(sql)"  */



//        STEP:6 Processing the result
        rs.next(); // it is used for pointing to the correct row
        String name = rs.getString("sname"); // we are mentioning the column name of the table to get the actual data
        System.out.println("Name: "+name);
//        STEP:7 Closing connection
        con.close();
        System.out.println("Connection closed");
    }
}