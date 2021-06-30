package WK2.D1.upperlowerfile;


import java.io.*;
import java.util.*;
       
class ulf{

  public static void main (String[] args) {
     try
    {
     FileReader fr = new FileReader("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file1.txt");
     BufferedReader br = new BufferedReader(fr);
     PrintWriter out = (new PrintWriter(new FileWriter("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/upperlowerfile/file3.txt")));
     String s="";
        while((s = br.readLine()) != null) 
        {
         out.write(s.toUpperCase()+"\n");
         }
         out.close();
    }
    catch(Exception e)
    {
     e.printStackTrace();
    }
}
}