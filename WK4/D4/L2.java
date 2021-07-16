package WK4.D4;

interface TestNumber{
    boolean Test(int n);
}
public class L2 {
    public static void main(String a[]) {
        TestNumber m;
        m =(int n)->((n%2)==0);
        if (m.Test(Integer.parseInt(a[0])))
        System.out.println("Even");
        m =(int n)->((n%2)==1);
        if (m.Test(Integer.parseInt(a[0])))
        System.out.println("Odd");
    }
}
    



