package WK3.D3;
import java.awt.*;
import java.awt.event.*;
public class CBFrame extends Frame implements ItemListener {
    Checkbox c1,c2,c3;
    public CBFrame(){
        Label l = new Label("select an item");
        CheckboxGroup cbg = new CheckboxGroup();
        c1 = new Checkbox("Red",true,cbg);
        c2 = new Checkbox("Green",false,cbg);
        c3 = new Checkbox("Blue",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);add(c1);add(c2);add(c3);
    }
    public void itemStateChanged(ItemEvent ie){
        int r=0,g=0,b=0;
        if(c1.getState()) r=255;
        if(c2.getState()) g=255;
        if(c3.getState()) b=255;
        setBackground(new Color(r,g,b));
        repaint();
    }
    public static void main(String a[]){
        CBFrame cf = new CBFrame();
        cf.setVisible(true);
        cf.setSize(300,300);
    }
}
