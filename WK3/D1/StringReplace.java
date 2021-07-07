package WK3.D1;
import java.util.*;
public class StringReplace {
    public static void main(String[] args) {  
  
        String s, s1, s2, s3; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"); 
        s = sc.nextLine();
        System.out.println("The String is:" +s); 
        
        s1= s.replaceAll("\\s", "mango"); 
        System.out.println("The new String is:" +s1);

        s2= s.replace("good", "mango");
        System.out.println("The new String s2 is:" +s2);

        s3= s.replaceFirst("\\s", "banana");
        System.out.println("The new String s3 is:" +s3);
    }
    
}
