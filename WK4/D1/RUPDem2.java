package WK4.D1;
import java.util.Scanner;
public class RUPDem2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username ");
        String u = sc.next();
        System.out.println("Enter your password ");
        String p = sc.next();
        String regexu = "A";
        String regexp = "12";
        
        boolean resu = u.matches(regexu);
        boolean resp = p.matches(regexp);

        if(resu && resp) {
           System.out.println("Valid Username and Password");
        } else {
           System.out.println("Invalid Username and Password");
        }
     }
    
}
    

