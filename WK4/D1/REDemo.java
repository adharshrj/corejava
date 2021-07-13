package WK4.D1;
import java.util.regex.*;
public class REDemo {
    public static void main(String a[]){
        Pattern p ;Matcher m;
        p = Pattern.compile("java");
        m=p.matcher("java");
        System.out.println(m.matches());
    }
}
