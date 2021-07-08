package WK3.D3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorScroll extends JFrame implements AdjustmentListener
{
    JScrollBar red;
    JScrollBar green;
    JScrollBar blue;
    int cr=0;
    int cg=0;
    int cb=0;


    ColorScroll()
    {
        super("COLOR SCROLLBAR");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red=new JScrollBar(JScrollBar.HORIZONTAL);
        green=new JScrollBar(JScrollBar.HORIZONTAL);
        blue=new JScrollBar(JScrollBar.HORIZONTAL);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);   
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {

        if(ae.getSource()==red)
            cr=ae.getValue();
        else if(ae.getSource()==green)
            cg=ae.getValue();
        else if(ae.getSource()==blue)
            cb=ae.getValue();
        System.out.println(cr + ":" + cg + ":" + cb);
        this.getContentPane().setBackground(new Color(cr,cg,cb)); 
    }


    public static void main(String args[])
    {
        ColorScroll cs =new ColorScroll();
        cs.setVisible(true);
        cs.setSize(300,300);  
    }
}
