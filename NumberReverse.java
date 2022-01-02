interface GenericFunction1<X>{
    X rev(X x);
}
public class NumberReverse {
    
    public static void main(String a[]){
    GenericFunction1<Integer> gf1;
    gf1 = (n) ->{
        int r=0;
        while(n>0){
            r=r*10+(n%10);
            n=n/10;
        }
        return r;
    };
    System.out.println("Reverse Integer 983436" +gf1.rev(983436));
}
    
}
