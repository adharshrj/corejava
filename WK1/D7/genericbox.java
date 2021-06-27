package srmb2corejava.WK1.D7;
//class is not generic but defines generic constructor
class genericbox {
    private int i;
    <T extends Number> genericbox(T t1){
        i=t1.intValue();
    }
    void show(){
        System.out.println("i=" +i);
    }
    
}

class main{
    public static void main(String[] args) {
        genericbox b1=new genericbox(10);
        b1.show();
    }
}