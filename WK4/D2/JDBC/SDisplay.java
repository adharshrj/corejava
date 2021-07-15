package WK4.D2.JDBC;
import java.sql.*;
public class SDisplay {
    public static void main(String a[]){
        Connection c=null;
        try{
            String database="DB11.mdb";
  
            String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true";  
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection(url);   
        } catch (ClassNotFoundException ce){
            System.out.println("Unable to load Driver");
        } catch(SQLException sql){
            System.out.println("Unable to load connection");
        }
        try{
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from Student");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            c.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
    
}
