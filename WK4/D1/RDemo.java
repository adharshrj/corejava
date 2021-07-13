package WK4.D1;
import java.lang.reflect.*;
public class RDemo {
    public static void main(String a[]){
        try{
    Class c = Class.forName("java.awt.Dimension");
    System.out.println("Constructors");
    Constructor c1[] = c.getConstructors();
    for(int i=0;i<c1.length;i++)
        System.out.println(" "+c1[i]);
        System.out.println("Fields");
    Field f[] = c.getFields();
    for(int i=0;i<f.length;i++)
        System.out.println(" "+f[i]);
        System.out.println("Methods");
    Method m[] = c.getMethods();
    for(int i=0;i<m.length;i++)
    System.out.println(" "+m[i]);
        }catch(ClassNotFoundException ce){}
    }
    
}
