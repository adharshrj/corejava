package WK4.D5;
interface SF{
    String f(String s);
}
public class LADemo {
    static String stringOp(SF sf,String s){
        return(sf.f(s));
    }
    public static void main(String a[]){
        String istr="Labda adds power to Java";
        String ostr,ostr1;
        System.out.println("Input String: "+istr);
        ostr=stringOp((str)->str.toUpperCase(),istr);
        System.out.println("Output String: "+ostr);
        ostr1=stringOp((str)->str.toLowerCase(),istr);
        System.out.println("Output String: "+ostr1);


    }
    
}
