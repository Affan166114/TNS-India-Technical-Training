import java.sql.*;

public class DemoJDBC1 {
    public static void main(String[] args) throws Exception{

        String sql = "select * from student";


//     STEP:2   loading and registering the driver (Not Important)
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            System.err.println("Could not load postgresql.Driver");
        }

//      STEP:3  creating connection (Connection means, connecting the application to the DB)
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to database successfully");

//        STEP:4 Creating Statement.
        Statement st = con.createStatement();

//        STEP:5 Executing Statement
        ResultSet rs = st.executeQuery(sql);


//        STEP:6 Processing the result

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
