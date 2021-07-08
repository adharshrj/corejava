package WK3.D2;

import java.awt.*;
import java.awt.event.*;


public class CalcFrame  extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextField tf1,tf2,tf3;
    Label l;
    CalcFrame(){
        super("Calc Frame");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button("0");
        b11=new Button("+");
        b12=new Button("C");
        b13=new Button("-");
        b14=new Button("X");
        b15=new Button("/");
        b16=new Button("=");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);

        l=new Label("Calc");
        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();

        setLayout(new GridLayout(5,4));
        add(l);add(b12);add(b10);add(b16);
        add(b7);add(b8);add(b9);add(b14);
        add(b4);add(b5);add(b6);add(b13);
        add(b1);add(b2);add(b3);add(b11);
        add(tf1);add(tf2);add(tf3);
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("1")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("2")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("3")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("4")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("5")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("6")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("7")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("8")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("9")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("0")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }else if(s.equals("+")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("-")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("X")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }
        else if(s.equals("/")){
            int n=Integer.parseInt(tf.getText());
            tf.setText(Integer.toString(n));
        }else{
            tf.setText("");
            
        }
    }
    public static void main(String a[]){
        CalcFrame cf = new CalcFrame();
        cf.setSize(800,800);
        cf.setVisible(true);
    }

}
