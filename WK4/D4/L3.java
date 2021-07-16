
package WK4.D4;
interface TestNumber{
    int test1(int n,int d);
    default void say(){
        System.out.println("Hi");
    }
}

public class L3 {
    public static void main(String a[]) {
        TestNumber m;
        m =(int n,int d)->(n+d);
        System.out.println(m.test1(10,15));
        m.say();
        m =(n,d)->(n-d);
        System.out.println(m.test1(10,15));
      
    }
    }
    



