package WK3.D6.Client;
import java.net.*;

import org.graalvm.compiler.replacements.IntrinsicGraphBuilder;

import java.io.*;
public class CDemo {
    public static void main(String a[]){
        try{
            String server = a[];
            int port = Integer.parseInt(a[1]);
            Socket s = new Socket(server,port)
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int i = dis.readInt();
            System.out.println(i);
            s.close();                    
        }catch(Exception e){
            System.out.println("Exception" +e);
        }
    }
}
