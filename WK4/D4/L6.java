package WK4.D4;
interface GF<T>{
    T rev(T t);
}
public class L6 {
    public static void main(String a[]){
        GF<String> f;
        f=(s)->{
            String rs="";
            for(int i =s.length()-1;i>=0;i--)
                rs+=s.charAt(i);
                return rs;
        };
        System.out.println("Reverse String of computer is=" +f.rev("computer"));
        GF<Integer> f1;
        f1 = (n) ->{
            int r=0;
            while(n>0){
                r=r*10+(n%10);
                n=n/10;
            }
            return r;
        };
        System.out.println("Reverse Integer 2353=" +f1.rev(2353));
    }
    
}
