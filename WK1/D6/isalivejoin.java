package srmb2corejava.WK1.D6;



public class isalivejoin extends Thread {
    public void run()
    {
        System.out.println("Adharsh ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("RJ ");
    }
    public static void main(String[] args)
    {
        isalivejoin c1 = new isalivejoin();
        isalivejoin c2 = new isalivejoin();
        c1.start();
        
        System.out.println(c1.isAlive());
        
        try {
            c1.join();
        }
        catch (InterruptedException ie) {
        }
        c2.start();
        System.out.println(c2.isAlive());
    }
}

