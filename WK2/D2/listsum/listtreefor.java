package WK2.D2.listsum;
import java.util.Iterator;
import java.util.TreeSet;
public class listtreesum {
    public static void main(String[] args)
    {
        TreeSet<Integer>
            ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(61);
        ts.add(87);
        ts.add(39);

        System.out.print("TreeSet: ");
        for (Integer value : ts)
            System.out.print(value
                             + ", ");
        System.out.println();
    }
    
}
