package WK4.D5;
interface MyInt<T>{
    void display(T v);
}
public class MIGDemo {
    public static <T> void MDisplay(T v){
        System.out.println("Result = " +v);
    }
    public static void main(String a[]) {
        MIGDemo obj = new MIGDemo();
        MyInt ref = MIGDemo::MDisplay;
        ref.display(10);
    }
    
}
