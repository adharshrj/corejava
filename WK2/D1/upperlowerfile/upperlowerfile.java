package WK2.D1.upperlowerfile;
import java.util.*;
import java.io.*;
public class upperlowerfile {
    public static void main (String[] args) {
        try
       {
        FileReader fr1 = new FileReader("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file1.txt");
        FileReader fr2 = new FileReader("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file2.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        BufferedReader br2 = new BufferedReader(fr2);
        PrintWriter out1 = (new PrintWriter(new FileWriter("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file3.txt")));
        PrintWriter out2 = (new PrintWriter(new FileWriter("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file3.txt")));
        String s1="";
        String s2="";
           
           
           while((s1 = br1.readLine() && s2 = br2.readLine()) != null) 
           {
            out1.write(s1.toUpperCase()+"\n");
            out2.write(s2.toUpperCase()+"\n");
            }
            out1.close();
            out2.close();
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
   }
   }