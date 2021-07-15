package WK4.D1;
import java.util.regex.*;
public class REMethods {
    public static void main(String a[]){
    Pattern p ;
        Matcher m;
        p = Pattern.compile("Adharsh is here");
        m = p.matcher("Adharsh is here 2");
        System.out.println(m.matches()+" "+m.find());
       
        String text = "Adharsh is here";
        String delimit =  "\\d";
        Pattern p1 = Pattern.compile(delimit, Pattern.CASE_INSENSITIVE);
        String[] result = p1.split(text);
        System.out.println(result);

        String sp = "(.*)(\\d+)(.*)";
        Pattern p2 = Pattern.compile(sp);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
         } else {
            System.out.println("NO MATCH");
         }
        

    }
        
}
