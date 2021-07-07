package WK3.D3;
import java.awt.*;
import java.awt.event.*;
public class CLFrame extends Frame implements ItemListener {
    Choice c;List l;
    public CLFrame(){
        Label l = new Label("select an item");
        c = new Choice();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);add(c);
    }
    public void itemStateChanged(ItemEvent ie){
        String s=c.getSelectedItem();
        if(s.equals("Red")) setBackground(Color.red);
        if(s.equals("Green")) setBackground(Color.green);
        if(s.equals("Blue")) setBackground(Color.blue);
        repaint();
    }
    public static void main(String a[]){
        CLFrame cf = new CLFrame();
        cf.setVisible(true);
        cf.setSize(300,300);
    }
}
