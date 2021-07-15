package WK4.D1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RUPDemo {

        
        public static boolean validUname(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username ");
            String uname = sc.next();
            String ur = "^[A-Za-z]\\w{5,29}$";
            Pattern pu = Pattern.compile(ur);
                if (uname == null) {
                return false;
                }
            Matcher mu = pu.matcher(uname);
            return mu.matches();
        }

        public static boolean validPasswd(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter your password ");
            String pwd = sc1.next();
            String pr = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
            Pattern pp = Pattern.compile(pr);
            if (pwd == null) {
                return false;
            }
            Matcher mp = pp.matcher(pwd);
            return mp.matches();
    public static void main(String[] args) {
        validUname();
        validPasswd();
    }
    
}
