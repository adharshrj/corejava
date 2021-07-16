package WK4.D5;
interface MI{
    void display();
}
public class MIDemo {
public static void myMethod(){
    System.out.println("Instance Demo");
}

    public static void main(String a[]) {
        MIDemo obj = new MIDemo();
        MI ref = MIDemo::myMethod; //obj.myMethod;
        ref.display();
}
}
