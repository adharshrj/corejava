package WK2.D6;
import java.util.*;

public class DuplicateTreeSet {
    public static void main(String a[]){
        String[] s = new String[]{ "A","B","C","D","1","2","C","A","4"};
        System.out.println("String with duplicates" + (Arrays.toString(s)));
        System.out.println();
        TreeSet<String> dup = new TreeSet<String>();
  
        for (String ele : s){
            if (!dup.add(ele)){
                System.out.println("Duplicates in string are   " + ele);
            }

        }
    }

}

    

