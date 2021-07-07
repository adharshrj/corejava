package WK3.D3;
import java.awt.*;
import java.awt.event.*;

public class MIFrame extends Frame{
    Label l;
    public MIFrame(){
        l = new Label("Mouse Event");
        setLayout(new FlowLayout());
        add(l);
        addMouseListener(new MAdapter());
    }
    class MAdapter extends MouseAdapter{
        public void mouseEntered(MouseEvent me){
           l.setText("Mouse Entered");
           setBackground(Color.blue); repaint();
       }
       public void mouseExited(MouseEvent me){
           l.setText("Mouse Exited");
           setBackground(Color.white); repaint();
       }
    }
    
    public static void main(String a[]){
        MIFrame mif = new MIFrame();
        mif.setVisible(true);
        mif.setSize(300,300);
    }
}
