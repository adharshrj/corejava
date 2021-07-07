package WK3.D3;
import java.awt.*;
import java.awt.event.*;

class MAdapter extends MouseAdapter{
 MAFrame maf;
 MAdapter(MAFrame maf){
     this.maf=maf;
 }

 public void mouseEntered(MouseEvent me){
    maf.l.setText("Mouse Entered");
    maf.setBackground(Color.blue); maf.repaint();
}
public void mouseExited(MouseEvent me){
    maf.l.setText("Mouse Exited");
    maf.setBackground(Color.white); maf.repaint();
}
}
public class MAFrame extends Frame{
    Label l;
    public MAFrame(){
        l = new Label("Mouse Event");
        setLayout(new FlowLayout());
        add(l);
        addMouseListener(new MAdapter(this));
    }
    
    public static void main(String a[]){
        MAFrame maf = new MAFrame();
        maf.setVisible(true);
        maf.setSize(300,300);
    }
}
