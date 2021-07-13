package WK4.D1;
import java.lang.reflect.*;
class A{
    public void a1(){}
    public void a2(){}
    protected void a3(){}
    private void a4(){}
}
public class RDemo1 {
    public static void main(String a[]){
    A aobj=new A();
    Class c = aobj.getClass();
    System.out.println("Public Methods");
    Method m[] = c.getDeclaredMethods();
    for(int i=0;i<m.length;i++)
        {
        int modifier=m[i].getModifiers();
    if(Modifier.isPublic(modifier))
    System.out.println(" "+m[i].getName());
        }
    }
}
