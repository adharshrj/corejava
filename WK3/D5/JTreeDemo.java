package WK3.D5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo extends JFrame implements TreeSelectionListener{
    JTree jt;
    JLabel jl;
    JTreeDemo(){
        DefaultMutableTreeNode college = new DefaultMutableTreeNode("College");
        DefaultMutableTreeNode ug = new DefaultMutableTreeNode("UG");
        DefaultMutableTreeNode pg = new DefaultMutableTreeNode("PG");
        DefaultMutableTreeNode be = new DefaultMutableTreeNode("B.E");
        DefaultMutableTreeNode btech = new DefaultMutableTreeNode("B.Tech");
        DefaultMutableTreeNode me = new DefaultMutableTreeNode("M.E.");
        DefaultMutableTreeNode mba = new DefaultMutableTreeNode("MBA");
        college.add(ug);college.add(pg);
        ug.add(be);ug.add(btech);
        pg.add(me);pg.add(mba);
        jt = new JTree(college); 
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp);
        jl = new JLabel("Path");
        add(jl,BorderLayout.SOUTH);                 
    }
    
    public void valueChanged(TreeSelectionEvent te){
        jl.setText("Selection." + te.getPath());
    }
    public static void main(String[] a)
    {
        JTreeDemo jtr = new JTreeDemo();
        jtr.setSize(300,300);
        jtr.setVisible(true);
    }
}
