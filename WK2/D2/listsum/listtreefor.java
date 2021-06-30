package WK2.D2.listsum;
import java.util.Iterator;
import java.util.TreeSet;
public class listtreefor {
    public static void main(String[] args)
    {
        TreeSet<Integer>
            ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(61);
        ts.add(87);
        ts.add(39);
        int Sum=0;
        System.out.print("TreeSet Sum: ");
        for (Integer value:ts)
        {
            Sum+=value;
        }
            System.out.println(Sum);
        System.out.println();
    }
    
}
