abstract class telephone{
    abstract void lift();
    abstract void disconnected();
}

class smarttelephone extends telephone{
    void lift(){
        System.out.println("Phone is lifted");
    }
    void disconnected(){
        System.out.println("Phone is Disconnected");
    }
}

class Phone{
    public static void main(String a[]) {
        smarttelephone stel=new smarttelephone();
        stel.lift();
        stel.disconnected();
        
    }
}