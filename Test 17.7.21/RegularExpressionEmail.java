import java.util.Scanner;
public class RegularExpressionEmail {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter your Email:-");
      String email = sc.next();
      String reg = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      if(email.matches(reg)) {
         System.out.println("Your email-id is valid");
      } else {
         System.out.println("The email-id entered is not valid");
      }
   }
}