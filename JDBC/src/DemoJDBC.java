//  STEP:1 Importing the packages
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5433/demoJDBC"; // Format: JDBC:Postgres Account(Software name): Database Name.  since the PostgreSql software is working on network we have to use "localhost:5432"
        String uname = "postgres"; //default username for postgres
        String pass = "syed166114"; // your set password

        String sql = "select * from student";


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

//        in this step we are printing only 1 column data

//        rs.next(); // it is used for pointing to the correct row(Point to next line)
//        String name = rs.getString("sname"); // we are mentioning the column name of the table to get the actual data
//        System.out.println("Name: "+name);


//        Printing Entire Table
        while(rs.next()){ // "rs.next()" is used for pointing to next row
            System.out.print(rs.getInt(1)+"-");
            System.out.print(rs.getInt(2)+"-");
            System.out.println(rs.getString(3));
        }

//        STEP:7 Closing connection
        con.close();
        System.out.println("Connection closed");
    }
}