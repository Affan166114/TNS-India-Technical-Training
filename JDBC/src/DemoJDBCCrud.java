import java.sql.*;

public class DemoJDBCCrud {
    public static void main(String[] args) throws Exception{
        

        String sqlInsert = "insert into student values(7,85,'Jonny')";
        String sqlUpdate = "update student set sname='Uthman' where sid=7";
        String sqlDel = "delete from student where sid=4";


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

//                                    CRUD Operations

//        Insert
       st.execute(sqlInsert); // if it is a 'Insert'/'Update'/'Delete' query it will return 'count' or 'False'
//                          OR
//        st.execute("insert into student values(4,95,'Abid')");

//        Update
        st.execute(sqlUpdate);

//        Delete
        st.execute(sqlDel);

//        STEP:7 Closing connection
        con.close();
        System.out.println("Connection closed");
    }
}
