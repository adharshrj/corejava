package WK3.D3;

import java.awt.event.*;
import javax.swing.*;

public class SwingButton {
    public static void main(String[] args) {  
        
        JFrame f=new JFrame("Number of clicks");  
        final JTextField tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        b.addActionListener(new ActionListener(){
            int clicked = 0;  
            public void actionPerformed(ActionEvent e){  
                    clicked++;
                    tf.setText(count(clicked));
                }  
            });  
            f.add(b);f.add(tf);  
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);   
        }
}