package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCBDemo extends JFrame implements ActionListener{
    JLabel jl;
    JComboBox jc;
    JCBDemo(){
        String s[]= {"IT1","IT2","IT3"};
        jc = new JComboBox(s);
        jc.addActionListener(this);
        jl=new JLabel();
        setLayout(new FlowLayout());
        add(jc);add(jl);
    }
    public void actionPerformed(ActionEvent ae){
        jl.setText((String)jc.getSelectedItem());
    }
    public static void main(String[] a)
    {
        JCBDemo jcb = new JCBDemo();
        jcb.setSize(300,300);
        jcb.setVisible(true);
    }
}
