package WK1.D7;

interface interface12<T extends Number> {

     int sq(T t);
}

class sq1<T extends Number> implements interface12<T>{
    public int sq(T i){
        return i.intValue()*i.intValue();
    }

    // void show(){
    //     System.out.println("Square =" +sq(T i));
    // }
}

public class genericinterface{
    public static void main(String[] args) {
    sq1<Float> sq2=new sq1<Float>();
    System.out.println(sq2.sq(25.0f));

    //sq2.show();    
        
    }
}