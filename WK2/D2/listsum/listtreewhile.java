package WK2.D2.listsum;
import java.util.Iterator;
import java.util.TreeSet;
  
public class listtreewhile {
    public static void main(String[] args)
    {
        TreeSet<Integer>
            ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(61);
        ts.add(87);
        ts.add(39);
        Iterator<Integer> iterator = ts.iterator();
  
        System.out.print("TreeSet: ");
        while (iterator.hasNext())
            System.out.print(iterator.next()
                             + ", ");
        System.out.println();
    }

}