abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainpen extends pen{
    void nib(){
        System.out.println("This is a Nib");
    }

   void write(){
        System.out.println("Start Writing");
    }

    void refill(){
        System.out.println("Time to refill");
    }



}

class fpen{
    public static void main(String[] args) {
        fountainpen p1=new fountainpen();
        p1.nib();
        p1.write();
        p1.refill();
        
    }
}