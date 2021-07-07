package WK3.D1;
import java.util.*;
public class StringSubset {
    
    public static void main(String[] args) {  
  
        String s; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"); 
        s = sc.nextLine();
        int l = s.length();  
        int t = 0;  
        
        String arr[] = new String[l*(l+1)/2];  
    
        for(int i = 0; i < l; i++) {  
            for(int j = i; j < l; j++) {  
                arr[t] = s.substring(i, j+1);  
                t++;  
            }  
        }   
        System.out.println("Subsets of the String ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
    }  
} 