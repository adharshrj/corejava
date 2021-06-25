package WK1.D5.Others;

class markoutofbound extends Exception{
    private int mark;
    markoutofbound(int mark){
        this.mark=mark;
    }
    public String toString(){
        return ("Invalid Mark");
    }
}

class student {
    private int rollno;
    private String name;
    private int mark;
    student(int rollno, String name, int mark){
        this.rollno=rollno;
        this.name=name;
        this.mark=mark;
    }
    public void display(){
        {try{
        System.out.println("Roll No:" +rollno);
        System.out.println("Name:" +name);
        if(mark<0) throw new markoutofbound(mark);
        System.out.println("Mark:" +mark);
        }catch(markoutofbound mkb){
            System.out.println(mkb);
        }
    }
    
}

static class mkx{
    public static void main(String a[]) {
        student s1=new student(1,"aa",100);
        student s2=new student(2,"bb",-55);
        s1.display();
        s2.display();
    }
}
}