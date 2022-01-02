import java.net.*;

class DatagramReceiver {
    public final static int buffersize = 50;
    public static void main(String a[]){
       try{
           int port=Integer.parseInt(a[0]);
           DatagramSocket soc = new DatagramSocket(port);
           byte buffer[] = new byte[buffersize];
           while(true){
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            soc.receive(p);
            String s = new String(p.getData());
            System.out.println(s);
           }

       } catch (Exception e){
           e.printStackTrace();
       }
    }
    
}
