import java.net.*;
class DatagramSender {
    public static void main(String a[]){
        try{
            int port=Integer.parseInt(a[1]);
            InetAddress ia = InetAddress.getByName(a[0]);
            DatagramSocket soc = new DatagramSocket();
            byte buffer[] = a[2].getBytes();
            DatagramPacket p = new DatagramPacket(buffer,buffer.length,ia,port);
            soc.send(p);
        } catch (Exception e){
            e.printStackTrace();
        }
     }
    
}
