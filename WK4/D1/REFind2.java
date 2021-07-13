package WK4.D1;
import java.util.regex.*;
public class REFind2{
    public static void main(String a[]){
        Pattern p ;
        Matcher m;
        p = Pattern.compile("java");
        m = p.matcher("java 1 2 3 java");
        while(m.find())
        System.out.println("Subsequence Found "+m.Start());
   
    }
}
