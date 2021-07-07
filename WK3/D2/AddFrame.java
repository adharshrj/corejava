package WK3.D2;

import java.awt.*;
import java.awt.event.*;


public class AddFrame extends Frame implements ActionListener{
    Button b1,b2;
    Label l1,l2,l3;
    TextField tf1,tf2,tf3;

    AddFrame(){
        super("Add Frame");
        b1=new Button("ADD");
        b2=new Button("CLEAR");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1=new Label("Enter First Number");
        l2=new Label("Enter Second Number");
        l3=new Label("Result");

        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();

        setLayout(new GridLayout(4,2));
        add(l1);add(tf1);
        add(l2);add(tf2);
        add(l3);add(tf3);
        add(b1);add(b2);
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("ADD")){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1+n2));
        }else{
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            
        }
    }
    public static void main(String a[]){
        AddFrame af = new AddFrame();
        af.setSize(200,200);
        af.setVisible(true);
    }

}
