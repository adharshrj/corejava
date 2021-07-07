package WK3.D1;
import java.util.Scanner;
public class CountVowelWord {
    public static int countWords(String str){
        if (str == null || str.isEmpty())
            return 0;
        String[] CountW = str.split("\\s+");
        return CountW.length;
    }
       public static void main(String args[]){
      int countL = 0;
      int countV = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      for (int i=0 ; i<str.length(); i++){
         char ch = str.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            countV ++;
         }
      }
      
      System.out.println("Number of vowels in the given sentence is "+countV);
      System.out.println("Number of words in the given sentence is "+ countWords(str));
   }
}