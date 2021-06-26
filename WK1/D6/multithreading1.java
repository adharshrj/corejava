package srmb2corejava.WK1.D6;
import java.util.*;

class randomno extends Thread{
    public void run()
     {
        for(int i =0; i<5; i++)
          {
                Random r = new Random();
                int n = r.nextInt(100);
                System.out.println(n);    
                
                square sq1 = new square(n);
                sq1.start();
 
                cube cu= new cube(n);
                cu.start();
 
          }
          try {

            Thread.sleep(1000);
           
           } 
         catch(Exception ex)
          {
            ex.printStackTrace();
          }
     }
}

class square extends Thread{
    int x;

    square(int n)
   
    {
        x = n;
    }
    public void run()
     {
          try
          {
                 int sq = x*x;
                 System.out.println(sq);
          }
         catch (Exception ex)
          {
            ex.printStackTrace();
          }
     }
}

class cube extends Thread{
    int x;

    cube(int n)
    {
        x = n;
    }
    public void run()
     {
          try
          {
                 int cc = x*x*x;
                 System.out.println(cc);
                
          }
         catch (Exception ex)
          {
            ex.printStackTrace();
          }
     }
}


class multithreading1 {
    public static void main(String[] args)
     {
          try
          {
               randomno rno = new randomno();
               rno.start();

             
              
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
    
}
