package WK3.D3;
import java.awt.*;
import java.awt.event.*;
public class TrafficLight extends Frame implements ItemListener {
    Checkbox red,yellow,green;
    Label l;
    public TrafficLight(){
        l= new Label("");
        CheckboxGroup cbg = new CheckboxGroup();
        red = new Checkbox("Red",cbg,false);
        yellow = new Checkbox("Yellow",cbg,false);
        green = new Checkbox("Green",cbg,false);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);

        setLayout(new GridLayout(4,1));
        add(l);
        add(red);
        add(yellow);
        add(green);
    }
    public void itemStateChanged(ItemEvent ie){
        red.setForeground(Color.BLACK);
		yellow.setForeground(Color.BLACK);
		green.setForeground(Color.BLACK);
        
		
		if(red.getState() == true) {
			red.setForeground(Color.RED);
			l.setForeground(Color.RED);
			l.setText("STOP");
            
		}
		else if(yellow.getState() == true) {
			yellow.setForeground(Color.YELLOW);
			l.setForeground(Color.YELLOW);
			l.setText("READY");
            
		}
		else{
			green.setForeground(Color.GREEN);
			l.setForeground(Color.GREEN);
			l.setText("GO");
           
		}
    }
    public static void main(String a[]){
        TrafficLight tl = new TrafficLight();
        tl.setVisible(true);
        tl.setSize(800,800);
    }
}
