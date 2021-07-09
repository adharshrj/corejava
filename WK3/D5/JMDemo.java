package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class JMDemo  extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu fm,em,hm;
    JMenuItem cut,copy,paste,sa;
    JTextArea ta;
    JMDemo(){
       mb = new JMenuBar();
       setJMenuBar(mb);

       fm = new JMenu("File");
       mb.add(fm);

       em = new JMenu("Edit");
       mb.add(em);

       hm = new JMenu("Help");
       mb.add(hm);

       cut = new JMenuItem("Cut");
       cut.addActionListener(this);
       em.add(cut);

       copy = new JMenuItem("Copy");
       copy.addActionListener(this);
       em.add(copy);

       paste = new JMenuItem("Paste");
       paste.addActionListener(this);
       em.add(paste);

       sa = new JMenuItem("Select All");
       sa.addActionListener(this);
       em.add(sa);

       ta=new JTextArea();
       add(ta);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==cut) ta.cut();
        if (ae.getSource()==copy) ta.copy();
        if (ae.getSource()==paste) ta.paste();
        if (ae.getSource()==sa) ta.selectAll();;
    }
    public static void main(String[] a)
    {
        JMDemo jm = new JMDemo();
        jm.setSize(300,300);
        jm.setVisible(true);
    }
}
