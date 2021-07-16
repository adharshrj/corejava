
package WK4.D4;
interface TestNumber{
    int Test(int n,int d);
}

public class L3 {
    public static void main(String a[]) {
        TestNumber m;
        m =(n,d)->(n+d);
        System.out.println(m.Test(10,15));
        m =(n,d)->(n-d);
        System.out.println(m.Test(10,15));
      
    }
    }
    



