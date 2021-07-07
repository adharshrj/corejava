package WK3.D3;
import java.awt.*;
import java.awt.event.*;

public class MEFrame extends Frame implements MouseListener {
    Label l;
    public MEFrame(){
        l = new Label("Mouse Event");
        setLayout(new FlowLayout());
        add(l);
        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent me){
        l.setText("Mouse Entered");
        setBackground(Color.blue); repaint();
    }
    public void mouseExited(MouseEvent me){
        l.setText("Mouse Exited");
        setBackground(Color.white); repaint();
    }
    public void mousePressed(MouseEvent me){
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent me){
        l.setText("Mouse Released");
        
    }
    public void mouseClicked(MouseEvent me){
        l.setText("Mouse Clicked");
        
    }
    public static void main(String a[]){
        MEFrame me = new MEFrame();
        me.setVisible(true);
        me.setSize(300,300);
    }
}
