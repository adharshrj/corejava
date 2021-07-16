package WK4.D5;
interface X{
    default void display(){
        System.out.println("Default Method");
    }
    static void sdisplay(){
        System.out.println("Static Method");

    }
}
class C implements X{}

class DSIDemo {
    public static void main(String a[]){
        C c1 = new C();
        c1.display();
        X.sdisplay();
    }
    
}
