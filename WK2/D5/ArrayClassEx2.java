package WK2.D5;
import java.util.*;
public class ArrayClassEx2 {
    public static void main(String[] args)
    {
        int intArr[] = {100,204,125,232,325};
       
        
        Arrays.sort(intArr);
       
        int intKey = 232;
       
  
        System.out.println(intKey + " found at index = "
                           +Arrays.binarySearch(intArr,intKey));

    }
}
