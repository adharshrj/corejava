package WK2.D6;

import java.util.ArrayList;

public class MinToFront {
    public static void main(String a[]) {
       
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(44);
        al.add(12);
        al.add(67);
        al.add(76);
        al.add(5);
        al.add(98);
        al.add(13);
        int min = 0;
        
        for (int i = 1; i < al.size(); i++) {
            if (al.get(min) > al.get(i)) {
                min = i;
            }
        }
        System.out.println(al.get(min));
        int minV = al.remove(min);
        System.out.println(al);
        al.add(0, minV);

        System.out.println(al);
    }
    
}
