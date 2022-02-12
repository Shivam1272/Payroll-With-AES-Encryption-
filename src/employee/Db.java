package employee;
import java.sql.*;

public class Db {
    Connection con;
    Statement stm;
    Db() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Shivam@$12");
            stm = con.createStatement();
            if(con.isClosed()){
                System.out.print("Connection Closed");
            }
            else{
                System.out.print("Connection created");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}

