package WK4.D2.RMI;
import java.rmi.*;
public class AddClient {
    public static void main(String a[]){
        try{
            String url ="rmi://"+a[0]+"/AddServer";
            AddServerIntf ai = (AddServerIntf)Naming.lookup(url);
            Double d = ai.add(Double.parseDouble(a[1]),Double.parseDouble(a[2]));
            System.out.println("Result:" = d);
        }Catch (Exception e){}
    }
    
}
