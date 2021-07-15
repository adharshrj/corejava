package WK4.D2.RMI;
import java.net.*;
import java.rmi.*;
public class AddServer {
    public static void main(String a[]){
        try{
            AddServerImpl asi = new AddServerImpl();
            Naming.rebind("AddServer",asi);
        }catch(Exception e){}
    }
}
