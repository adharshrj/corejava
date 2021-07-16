package WK4.D5;
import java.util.function.*;
public class PFIDemo {
    public static void main(String a[]){
        Function<Integer,Integer> fact = (n) -> {
            int r=1;
            for(int i=1;i<=n;i++)
                r=r*i;
                return r;
        };
        System.out.println("5! = "+fact.apply(5));
    }
    
}
