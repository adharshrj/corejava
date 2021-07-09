package WK3.D4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTemp extends JFrame implements ActionListener {
    Container c=getContentPane();
    JTextField jt = new JTextField();
    JRadioButton jrb1 = new JRadioButton();
    JRadioButton jrb2 = new JRadioButton();
    JButton jb = new JButton();
    ButtonGroup bg = new ButtonGroup();
    JLabel jl = new JLabel();
    String s1;
    
    SwingTemp(){
        s1 = "";
        c.setLayout(null);
        
        jrb1.setBounds(120, 130, 120, 50);
        jrb2.setBounds(250, 130, 80, 50);
        
        jb = new JButton("Convert");
        jb.setBounds(85, 190, 180, 30);
        
        jt = new JTextField(16);
        jt.setBounds(50,50,250,50);
        jt.setEditable(true);
        
        jl = new JLabel("Select Unit");
        jl.setBounds(20, 130, 150, 50);

        jrb1.setText("Celcius");
        jrb2.setText("Farenheit");
        
        c.add(jt);
        c.add(jrb1);
        c.add(jrb2);
        c.add(jb);
        c.add(jl);

        bg.add(jrb1);
        bg.add(jrb2);

        // jb.addActionListener(new ActionListener() { 
        //     public void actionPerformed(ActionEvent e){
        //         String s = "";
        //         if (jrb1.isSelected()) {
        //             if (!s1.equals(""))
        //              s1 = (Double.parseDouble(s)-32.0)/1.8;
        //             jt.setText(s1);

        //         }else{
        //         if (!s1.equals(""))
        //              s1 = (Double.parseDouble(s)*32.0)+1.8;
        //             jt.setText(s1);
        //         }
        //     }
        // }
    } 
    public static void main(String[] a)
    {
        SwingTemp st = new SwingTemp();
        st.setTitle("Temperature Converter");
        st.setVisible(true);
        st.setBounds(10,10,370,600);
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        st.setResizable(false);

    }
}
