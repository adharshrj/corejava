package WK4.D3;
import java.sql.*;
public class MTDemo {
    public static void main(String a[]){
        Connection c=null;
        PreparedStatement ps1=null,ps2=null;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:DB1");   
            ps1 = c.prepareStatement("update Account set balance=balance-? where ano=?");
            ps2 = c.prepareStatement("update Account set balance=balance+? where ano=?");
            c.setAutoCommit(false);
        } catch (ClassNotFoundException ce){
            System.out.println("Unable to load Driver");
        } catch(SQLException sql){
            System.out.println("Unable to load connection");
        }
        try{
            ps1.setInt(1,Integer.parseInt(a[2]));
            ps1.setInt(2,Integer.parseInt(a[0]));
            ps2.setInt(1,Integer.parseInt(a[2]));
            ps2.setInt(2,Integer.parseInt(a[1]));
            int k1 = ps1.executeUpdate();
            int k2 = ps2.executeUpdate();
            if (k1>0&&k2>0){
            System.out.println("Transaction Success");
            c.commit();
            }else{
            System.out.println("Transaction Failed");
            c.close();
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
    
}
