package WK3.D2;
import java.awt.*;
import java.awt.event.*;
public class BFrame extends Frame implements ActionListener{
    Button b;
    Label l;
    BFrame(String t){
        super(t); setLayout(new FlowLayout());
       
        Button b1 = new Button("Red");
        Button b2 = new Button("Blue");
        Button b3 = new Button("Green");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ae){
            String s= ae.getActionCommand();
            if(s.equals("Red")) setBackground(Color.red);
            else if(s.equals("Blue")) setBackground(Color.blue);
            else setBackground(Color.green);
        repaint();
        }
    
    public static void main(String a[]){
        BFrame Bf = new BFrame("New Color Frame");
        Bf.setVisible(true);
        Bf.setSize(200,200);

    }
}
