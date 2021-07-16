package WK4.D4;
interface SF{
    String rev(String s);
}
public class L5 {
    public static void main(String a[]){
        SF f;
        f=(s)->{
            String rs="";
            for(int i =s.length()-1;i>=0;i--)
                rs+=s.charAt(i);
                return rs;
        };
        System.out.println("Reverse String of computer is=" +f.rev("computer"));
    }
    
}
