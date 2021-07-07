package WK3.D2;

import java.awt.*;
import java.awt.event.*;

public class CalcFrame  extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5;
    Label l1,l2,l3;
    TextField tf1,tf2,tf3;

    CalcFrame(){
        super("Calc Frame");
        b1=new Button("ADD");
        b2=new Button("CLEAR");
        b3=new Button("SUBTRACT");
        b4=new Button("MULTIPLY");
        b5=new Button("DIVIDE");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        l1=new Label("Enter First Number");
        l2=new Label("Enter Second Number");
        l3=new Label("Result");

        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();

        setLayout(new GridLayout(6,2));
        add(l1);add(tf1);
        add(l2);add(tf2);
        add(l3);add(tf3);
        add(b1);add(b3);
        add(b4);add(b5);
        add(b2);
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("ADD")){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1+n2));
        }else if(s.equals("SUBTRACT")){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1-n2));
        }
        else if(s.equals("MULTIPLY")){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1*n2));
        }
        else if(s.equals("DIVIDE")){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1/n2));
        }else{
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            
        }
    }
    public static void main(String a[]){
        CalcFrame cf = new CalcFrame();
        cf.setSize(800,800);
        cf.setVisible(true);
    }

}
