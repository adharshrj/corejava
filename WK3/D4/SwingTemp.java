package WK3.D4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTemp extends JFrame implements ActionListener {
    Container c=getContentPane();
    JTextField jt = new JTextField();
    JRadioButton jrb1 = new JRadioButton();
    JRadioButton jrb2 = new JRadioButton();
    ButtonGroup bg = new ButtonGroup();
    JLabel jl = new JLabel();
    JLabel jrs = new JLabel();
    
    
    SwingTemp(){
        
        c.setLayout(null);
        
        jrb1.setBounds(120, 130, 120, 50);
        jrb2.setBounds(250, 130, 80, 50);
        
        
        jt = new JTextField(16);
        jt.setBounds(50,50,250,50);
        jt.setEditable(true);
        
        jl = new JLabel("Select Unit");
        jl.setBounds(20, 130, 150, 50);
        jrs = new JLabel("Result");
        jrs.setBounds(85, 190, 180, 30);

        jrb1.setText("Celcius");
        jrb2.setText("Farenheit");
        
        c.add(jt);
        c.add(jrb1);
        c.add(jrb2);
        
        c.add(jl);
        c.add(jrs);

        bg.add(jrb1);
        bg.add(jrb2);
        jrb1.addActionListener(this);
        jrb2.addActionListener(this);
    }
         public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()== jrb2)
            {
                double a= Double.parseDouble(jt.getText());
                double f = (a*1.8)+32;
                jrs.setText("Celcius to Farenheit " + f +"'F");
            }
            
            if(e.getSource()== jrb1)
            {
                double a= Double.parseDouble(jt.getText());
                double c = (a-32)*1.8;
                jrs.setText("Farenheit to Celcius: " + c+ "'C");
            }
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
