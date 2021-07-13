package WK4.D1;
import java.util.regex.*;
public class REFind1 {
    public static void main(String a[]){
        Pattern p ;
        Matcher m;
        p = Pattern.compile("java");
        m = p.matcher("java");
        System.out.println(m.matches()+" "+m.find());
        //if(m.find()) System.out.println("Subsquence Found");
    }
}
