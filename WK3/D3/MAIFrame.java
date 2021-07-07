package WK3.D3;
import java.awt.*;
import java.awt.event.*;

public class MAIFrame extends Frame{
    Label l;
    public MAIFrame(){
        l = new Label("Mouse Event");
        setLayout(new FlowLayout());
        add(l);
        addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent me){
           l.setText("Mouse Entered");
           setBackground(Color.blue); repaint();
        }
        public void mouseExited(MouseEvent me){
           l.setText("Mouse Exited");
           setBackground(Color.white); repaint();
        }
        });
    }
    
    public static void main(String a[]){
        MAIFrame maif = new MAIFrame();
        maif.setVisible(true);
        maif.setSize(300,300);
    }
}
