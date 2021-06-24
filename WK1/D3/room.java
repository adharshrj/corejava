class room{

    int roomno;
    String roomtype;
    float roomarea;
    boolean ac;

    void setdata (int rno,String rtype,float rarea,boolean acn){
        roomno=rno;
        roomtype=rtype;
        roomarea=rarea;
        ac=acn;
    }

    void displaydata(){
       System.out.println("Room no. is" +roomno); 
       System.out.println("Room type is" +roomtype); 
       System.out.println("Room area is" +roomarea); 
       String s = (ac) ? "yes" : "no";
       System.out.println("AC needed" +s); 
    }
    public static void main(String a[]) {
    room room1 = new room();
    room1.setdata(1,"Large",100f,true);
    room1.displaydata();
        
    }
}