package WK4.D3;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class SDFrame extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    PreparedStatement ps;

    SDFrame(){
        l1 = new JLabel("Register Number");
        l2 = new JLabel("Name           ");
        l3 = new JLabel("Course         ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("Search");
        b1.addActionListener(this);
        b2 = new JButton("Exit");
        b2.addActionListener(this);

        setLayout(new GridLayout(4,2));
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);add(b2);
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c = DriverManager.getConnection("jdbc:odbc:DB11");  
            ps = c.prepareStatement("Select * from Student where regno=?");
        } catch (ClassNotFoundException ce){
            System.out.println("Unable to load Driver");
        } catch(SQLException sql){
            System.out.println("Unable to load connection");
        }
    }
    public void actionPerformed(ActionEvent ae){
       String s = ae.getActionCommand();
       if(s.equals("Search")){try{
           ps.setInt(1, Integer.parseInt(t1.getText()));
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
           t2.setText(rs.getString(2));
           t3.setText(rs.getString(3));
           }
            }catch (Exception e)
       }else {
           System.exit(0);
       }
    }
    public static void main(String a[]){
        SDFrame sd = new SDFrame();
        sd.show();
        sd.setSize(400, 400);
    }
}
