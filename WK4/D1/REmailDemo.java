package WK4.D1;
import java.util.Scanner;
public class REmailDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your e-mail: ");
        String p = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        
        boolean res = p.matches(regex);
        if(res) {
           System.out.println("Valid e-mail");
        } else {
           System.out.println("Invalid e-mail");
        }
     }
    
}
