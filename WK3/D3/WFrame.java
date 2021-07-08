package WK3.D3;
import java.awt.*;
import java.awt.event.*;


public class WFrame extends Frame{
    Label l;
    public WFrame(){
        l = new Label("Window Adapter");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(new WindowAdapter());
    }

    class WindowAdapter
    extends Object
    implements WindowListener, WindowStateListener, WindowFocusListener{

        public void windowOpened(WindowEvent e){
            l.setText("Window Opened");
        }
        public void windowClosing(WindowEvent e){
            l.setText("Window Closing");
        }
        public void windowIconified(WindowEvent e){
            l.setText("Window Confied");
        }
        public void windowDeiconified(WindowEvent e){
            l.setText("Window Deiconfied");
        }
        public void windowActivated(WindowEvent e){
            l.setText("Window Activated");
        }
        public void windowDeactivated(WindowEvent e){
            l.setText("Window Deactivated");
        }
        public void windowStateChanged(WindowEvent e){
            l.setText("Window State Changed");
        }
        public void windowGainedFocus(WindowEvent e){
            l.setText("Window Gained Focus");
        }
        public void windowLostFocus(WindowEvent e){
            l.setText("Window Lost Focus");
        }
    }
    
    public static void main(String a[]){
        WFrame wf = new WFrame();
        wf.setVisible(true);
        wf.setSize(300,300);
    }
}
