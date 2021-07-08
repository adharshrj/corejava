package WK3.D4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingDemo implements ActionListener {
    JLabel jl;
    SwingDemo()
    {
        JFrame jf = new JFrame("Simple Swing App");
        jf.setSize(300,300);
        JLabel jl = new JLabel("Java Swing App");
        jf.setLayout(new FlowLayout());
        jf.add(jl);
        JButton jb = new JButton("Click me");
        jb.addActionListener(this);
        jf.add(jb);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent as){
        jl.setText("Button Clicked");
    }
    public static void main(String a[]){
        new SwingDemo();
    }
    
}
