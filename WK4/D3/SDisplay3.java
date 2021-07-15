package WK4.D3;
import java.sql.*;
public class SDisplay3 {
    public static void main(String a[]){
        Connection c=null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:DB11");   
        } catch (ClassNotFoundException ce){
            System.out.println("Unable to load Driver");
        } catch(SQLException sql){
            System.out.println("Unable to load connection");
        }
        try{
            Statement s = c.createStatement(CONCUR_UPDATABLE);
            ResultSet rs = s.executeQuery("select * from Student");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            c.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
    
}
