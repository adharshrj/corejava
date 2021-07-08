package WK3.D2;
import java.awt.*;
import java.awt.event.*;

public class PalinFrame extends Frame implements ActionListener{
   Button b;
   TextField tf1,tf2;
   Label l1, l2;

   PalinFrame() {
       super("Palindrome");
       b=new Button("CHECK");
       b.addActionListener(this);

       l1=new Label("Enter the string");
       l2=new Label("Result");

       tf1=new TextField();
       tf2=new TextField();
       setLayout(new GridLayout(5,1));
       add(l1);add(tf1);add(b);add(l2);add(tf2);
   }
   public static boolean isPalindrome(String word) {
      int left = 0;
      int right = word.length() - 1;

      while (left < right) {
          if (word.charAt(left) != word.charAt(right)) {
              return false;
          }
          left++;
          right--;
      }

      return true;
  }
  public void actionPerformed(ActionEvent ae){
   String s=ae.getActionCommand();
   if(s.equals("CHECK")){
      String Str = tf1.getText();
      tf2.setText(Boolean.toString(isPalindrome(Str)));
   }else{
      tf1.setText("");
      tf2.setText("");
   }
   }
   public static void main(String a[]){
    PalinFrame pf = new PalinFrame();
    pf.setVisible(true);
    pf.setSize(200,200);
    pf.setTitle("Palindrome");
}
    
}
