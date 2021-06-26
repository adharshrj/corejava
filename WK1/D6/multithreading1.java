package srmb2corejava.WK1.D6;

class randomno extends Thread{
    public void run()
     {
          try
          {
                double n = Math.random();
                System.out.println(n);            
          }
         catch(Exception ex)
          {
            ex.printStackTrace();
          }
     }
}

class square extends randomno{
    public void run()
     {
          try
          {
                if (n%2==0){
                 double sq = n*n;
                 System.out.println(sq);
                }
          }
         catch (Exception ex)
          {
            ex.printStackTrace();
          }
     }
}

class cube extends randomno{
    public void run()
     {
          try
          {
                if (n%2!=0){
                 double cc = n*n*n;
                 System.out.println(cc);
                }
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

               square sq1 = new square();
               sq1.start();

               cube cu = new cube();
               cu.start();

              
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
    
}
