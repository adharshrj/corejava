package WK4.D3;
import java.sql.*;
public class SDisplay1 {
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
            Statement s = c.createStatement();
            int rno = Integer.parseInt(a[0]);
            ResultSet rs = s.executeQuery("select * from Student where regno =" +rno);
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            c.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
    
}
