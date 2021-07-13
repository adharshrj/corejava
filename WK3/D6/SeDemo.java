package WK3.D6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Emp {
    private int eno;
    private String ename;
    Emp(int eno, String ename){
        this.eno =eno;
        this.ename = ename;
    }
    
    public String toString(){
    return("Emp No: " +eno + "Emp name: " +ename);
    }
}

public class SeDemo{
    public static void main(String a[]){
        try{
        Emp e1 = new Emp(101,"a");
        System.out.println("Before Storing Object:" +e1);
        FileOutputStream fos = new FileOutputStream("emp");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(e1);
        os.flush();
        os.close();
        }catch(IOException ie){System.out.println(ie);}

        try{
            FileInputStream fin = new FileInputStream("emp");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Emp e = (Emp)ois.readObject();
            ois.close();
            System.out.println("After Retreiving Object: " +e);
        }catch(Exception e){System.out.println(e);}
    }
}

