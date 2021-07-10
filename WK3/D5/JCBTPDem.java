package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class JCBTPDem  extends JFrame implements ActionListener{
    JLabel jl;
    JComboBox jc;
    JCBTPDem(){
        String s[]= {"IT1","IT2","IT3"};
        jc = new JComboBox(s);
        jc.addActionListener(this);
        jl=new JLabel();
        setLayout(new FlowLayout());
        add(jc);add(jl);
        
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("City", new CPanel());
        jtp.addTab("Color", new ColorPanel());
        add(jtp);

    }
    public void actionPerformed(ActionEvent ae){
        jl.setText((String)jc.getSelectedItem());
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
        JCBTPDem jt = new JCBTPDem();
        jt.setSize(300,300);
        jt.setVisible(true);
    }
}
