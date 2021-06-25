package WK1.D5.Others;

class payoutofbound extends Exception{
    private int pay;
    payoutofbound(int pay){
        this.pay=pay;
    }
    public String toString(){
        return ("Invalid Pay");
    }
}

class employee {
    private int eno;
    private String ename;
    private int bpay;
    employee(int eno, String ename, int bpay){
        this.eno=eno;
        this.ename=ename;
        this.bpay=bpay;
    }
    public void display(){
        {try{
        System.out.println("Employee No:" +eno);
        System.out.println("Employee Name:" +ename);
        if(bpay<5000) throw new payoutofbound(bpay);
        System.out.println("Basic Pay:" +bpay);
        }catch(payoutofbound pob){
            System.out.println(pob);
        }
    }
    
}

static class pob{
    public static void main(String a[]) {
        employee e1=new employee(1,"aa",10000);
        employee e2=new employee(2,"bb",500);
        e1.display();
        e2.display();
    }
}
}
