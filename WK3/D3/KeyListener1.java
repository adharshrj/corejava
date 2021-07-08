package WK3.D3;
import java.awt.*;  
import java.awt.event.*;  
public class KeyListener1 extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    public KeyListener1(){    
        l=new Label();  
        l.setBounds(20,50,200,20);  
        area=new TextArea();  
        area.setBounds(20,80,300,300);  
        area.addKeyListener(this); 
        setLayout(null);  
        add(l);add(area);        
    }  
    public void keyPressed(KeyEvent e) {}  
    
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();  
        String words[]=text.split("\\s");  
        l.setText("Words: "+words.length+" Characters:"+text.length());  
    }  
    public void keyTyped(KeyEvent e) {}  
  
    public static void main(String[] args) {  
        KeyListener1 key = new KeyListener1();
        key.setSize(400,400);  
        key.setVisible(true);
    }  
}  