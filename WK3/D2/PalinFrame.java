package WK3.D2;

class PalinD{
    {
        String s, r = "";
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter a string:");
        s = sc.nextLine();
   
        int l = s.length();
   
        for ( int i = l - 1; i >= 0; i-- )
           r = r + s.charAt(i);
   
        if (s.equals(r))
           System.out.println(s+" is a palindrome");
        else
           System.out.println(s+" is not a palindrome");
   
     }

}

public class PalinFrame extends Frame implements ActionListener{
    
   public static void main(String a[]){
    PalinFrame pf = new PalinFrame();
    pf.setVisible(true);
    pf.setSize(200,200);
    pf.setTitle("Palindrome");
}
    
}
