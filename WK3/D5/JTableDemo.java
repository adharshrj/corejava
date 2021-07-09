package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class JTableDemo  extends JFrame{
    JTable jt;
    JTableDemo(){
        Object[][] d={{"Arun","50"},{"Anu","60"},{"Balu","55"}};
        Object[] h = {"Name","Mark"};
        jt = new JTable(d,h);
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp);
    }
    public static void main(String[] a)
    {
        JTableDemo jt = new JTableDemo();
        jt.setSize(300,300);
        jt.setVisible(true);
    }
}
