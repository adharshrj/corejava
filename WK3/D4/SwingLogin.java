package WK3.D4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class SwingLogin extends JFrame implements ActionListener {
 
    Container c=getContentPane();
    JLabel uLabel=new JLabel("USERNAME");
    JLabel pLabel=new JLabel("PASSWORD");
    JTextField uTextField=new JTextField();
    JPasswordField pField=new JPasswordField();
    JButton login=new JButton("LOGIN");
    JButton reset=new JButton("RESET");
    JCheckBox showPassword=new JCheckBox("Show Password");
 
 
    SwingLogin()
    {
       c.setLayout(null);

       uLabel.setBounds(50,150,100,30);
       pLabel.setBounds(50,220,100,30);
       uTextField.setBounds(150,150,150,30);
       pField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       login.setBounds(50,300,100,30);
       reset.setBounds(200,300,100,30);
  
       c.add(uLabel);
       c.add(pLabel);
       c.add(uTextField);
       c.add(pField);
       c.add(showPassword);
       c.add(login);
       c.add(reset);
  
    }

    public static void main(String[] a){
        SwingLogin sl=new SwingLogin();
        sl.setTitle("Login Form");
        sl.setVisible(true);
        sl.setBounds(10,10,370,600);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sl.setResizable(false);
 
    }
 
}