package WK3.D6.Client;

import java.net.*;

public class DSDemo {
    public static void main(String a[]){
        try{
            int port=Integer.parseInt(a[1]);
            InetAddress ia = InetAddress.getByName(a[0]);
            DatagramSocket ds = new DatagramSocket();
            byte buffer[] = a[2].getBytes();
            DatagramPacket dp = new DatagramPacket(buffer,buffer.length,ia,port);
            ds.send(dp);
        } catch (Exception e){
            e.printStackTrace();
        }
     }
    
}
