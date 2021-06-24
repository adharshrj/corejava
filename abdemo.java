abstract class shape{
    abstract void display();
    abstract void input();
}

class circle extends shape{
    abstract void display();
    {
        System.out.println("Circle");
    }
    void input(){}
}

class rectangle extends shape{
    abstract void display();
    {
        System.out.println("Rectangle");
    }
    void input(){}
}

class square extends rectangle{
    abstract void display();
    {
        System.out.println("Square is a Rectangle");
    }
    void input(){}
}

class abdemo{
    public static void main(String a[]) {
        shape s1= new circle();
        shape s2= new rectangle();
        rectangle r1= new square();
        s1.display();
        s2.display();
        r1.display();
        
    }
}