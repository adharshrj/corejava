package WK3.D2;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame implements ActionListener{
    Button b = new Button("Click Me");
    Label l = new Label("First Label", Label.LEFT);
    MyFrame(){
        super(); setLayout(new FlowLayout());
        //Label l =new Label("First Label", Label.LEFT);
        //Button b = new Button("Click Me");
        add(l);
        add(b);
        b.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ae){
            b.setLabel("Thank you");
            l.setText("Button Clicked");
        }
    
    public static void main(String a[]){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
        mf.setSize(200,200);
        mf.setTitle("New Simple Frame 2");
    }
}
