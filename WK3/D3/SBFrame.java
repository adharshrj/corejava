package WK3.D3;
import java.awt.*;
import java.awt.event.*;

public class SBFrame extends Frame implements AdjustmentListener {
    Scrollbar sb;Label l;
    public SBFrame(){
        Label l = new Label("Value:0");
        sb = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,100);
        sb.addAdjustmentListener(this);
        setLayout(new FlowLayout());
        add(l);add(sb);
    }
    public void adjustmentValueChanged(AdjustmentEvent ie){
        l.setText("Value: " + sb.getValue());
    }
    public static void main(String a[]){
        SBFrame sb = new SBFrame();
        sb.setVisible(true);
        sb.setSize(300,300);
    }
}
