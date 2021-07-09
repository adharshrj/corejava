package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class JTPDemo  extends JFrame{
    
    JTPDemo(){
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("City", new CPanel());
        jtp.addTab("Color", new ColorPanel());
        add(jtp);
    }
    class CPanel extends JPanel{
        CPanel(){
            JCheckBox c1 = new JCheckBox("Chennai");
            JCheckBox c2 = new JCheckBox("Madurai");
            add(c1);add(c2);
        }
    }
    class ColorPanel extends JPanel{
        ColorPanel(){
            JButton b1 = new JButton("Red"); add(b1);
            JButton b2 = new JButton("Blue"); add(b2);
            JButton b3 = new JButton("Green"); add(b3);
        }
    }
    public static void main(String[] a)
    {
        JTPDemo jt = new JTPDemo();
        jt.setSize(300,300);
        jt.setVisible(true);
    }
}
