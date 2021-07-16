package WK4.D5;
interface AF{
    double f(double d[]) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Empty Array");
    }
}
public class LEDemo {
  
    public static void main(String a[]) throws EmptyArrayException{
        double d[]={10.6,11.6,13.7,12.8};
        double b[]={};
        double num=10.0;
        AF af=(n)->{
            double sum=0;
            if(n.length==0) throw new EmptyArrayException();
                for(int i=0;i<n.length;i++)
                    sum+=n[i];
                    num++;
                    return (sum+num);
        };
        System.out.println("Sum: "+af.f(d));
        System.out.println(af.f(b));


    }
    
}
