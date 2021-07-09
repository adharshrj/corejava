package WK3.D2;

import java.awt.*;
import java.awt.event.*;


public class CalcFrame  extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    TextField tf;
    Label l;
    String s0, s1, s2;
    CalcFrame(){
        
        super("Calc Frame");
        s0 = s1 = s2 = "";
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
        b14=new Button("*");
        b15=new Button("/");
        b16=new Button("=");
        b17=new Button(".");
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
        b16.addActionListener(this);
        b17.addActionListener(this);

        l=new Label("Calc");
        tf=new TextField();
        

        setLayout(new GridLayout(4,4));
        add(tf);add(b12);add(b10);add(b16);
        add(b7);add(b8);add(b9);add(b14);
        add(b4);add(b5);add(b6);add(b13);
        add(b1);add(b2);add(b3);add(b11);
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            tf.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";

            tf.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {

            double te;

            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            tf.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);

            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);

                s1 = s;

                s2 = "";
            }
            tf.setText(s0 + s1 + s2);
        }
    }

    public static void main(String a[]){
        CalcFrame cf = new CalcFrame();
        cf.setSize(800,800);
        cf.setVisible(true);
    }

}
