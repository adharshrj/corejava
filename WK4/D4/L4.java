package WK4.D4;

interface Factorical{
    int Fact(int n);
}

public class L4 {
    public static void main(String a[]) {
        Factorical f;
        f=(n)->{
            int r =1;
            for(int i=1;i<=n;i++)
            r=r*i;
            return r;
        };
    System.out.println("5!="+f.Fact(5));
    }
}
