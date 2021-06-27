package srmb2corejava.WK1.D7;

interface interface<Float> {

     int sq(T t);
}

class sq1<FLoat> implements interface<FLoat>{
    public int sq(T i){
        return i.intValue()*i.intValue();
    }

    void show(){
        System.out.println("Square =" +sq(T t));
    }
}

public class genericinterface{
    public static void main(String[] args) {
    sq1<Float> sq2=new sq1<Float>(25f);
    sq2.show();    
        
    }
}