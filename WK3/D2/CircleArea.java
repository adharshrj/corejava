package WK3.D2;
import java.awt.*;
import java.awt.event.*;

public class CircleArea extends Frame implements ActionListener {

    Button b;
    TextField tf1,tf2;
    Label l1, l2;

    CircleArea() {
        super("Area of Circle");
        b=new Button("AREA");
        b.addActionListener(this);

        l1=new Label("Enter the radius");
        l2=new Label("Result");

        tf1=new TextField();
        tf2=new TextField();
        setLayout(new GridLayout(4,1));
        add(l1);add(tf1);add(b);add(tf2);
        
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("AREA")){
            double r=Double.parseDouble(tf1.getText());
            tf2.setText(Double.toString(3.14*r*r));
        }else{
            tf1.setText("");
            tf2.setText("");
        }
    }    

    public static void main(String args[]) {
        CircleArea ca = new CircleArea();
        ca.setSize(400,400);
        ca.setVisible(true);
    }
}