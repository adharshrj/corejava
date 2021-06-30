package WK2.D1;

import java.applet.*;
import java.awt.*;
import java.util.*;

/*
<applet code = "datetimeapplet.class" width = "500" height = "400">
</applet>
*/
public class datetimeapplet extends Applet implements Runnable
{
  Thread t,t1;
  Label l1,l2;
  TextField t2,t3;
  int day, month, year;
  public void init()
  {
   t2=new TextField(20);
   l1=new Label("Time");
   t3=new TextField(20);
   l2=new Label("Date");
   add(l1);
   add(t2);
   add(l2);
   add(t3); 
  }
  public void start()
  {
   t = new Thread(this);
   t.start();
  }
  public void run()
  {
   t1 = Thread.currentThread();
   while(t1 == t){
   repaint();
   try
   {
    t1.sleep(1000); 
   }
   catch(InterruptedException e)
   {
   }
   }
 }

  public void paint(Graphics g)
  {
    Calendar cal = new GregorianCalendar();
    GregorianCalendar date = new GregorianCalendar();
    String hour = String.valueOf(cal.get(Calendar.HOUR));
    String minute = String.valueOf(cal.get(Calendar.MINUTE));
    String second = String.valueOf(cal.get(Calendar.SECOND));
    String msg=""+hour + ":" + minute + ":" + second;
    t2.setText(msg);
    day = date.get(Calendar.DAY_OF_MONTH);
    month = date.get(Calendar.MONTH);
    year = date.get(Calendar.YEAR);
    String msg1=""+day + ":" + month + ":" + year;
    t3.setText(msg1);
  }
}