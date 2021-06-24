class publication{
    private String title;
    private float price;
    void setData(String title, float price);
    {
        this.title=title;
        this.price=price;
    }
    void putData()
    {
        System.out.println("Title:"+ title);
        System.out.println("Price:"+ price);
    }
}

class book extends publication{
    private int pages;
    void setData1(String title, float price, int pages){
        setData(title,price);
        this.pages=pages;
    }
    void putData()
    {
        super.putData();
        System.out.println("Page No." +pages);
    }
}

class cd extends publication{
    private int pages;
    void setData2(String title, float price, int ptime){
        setData(title,price);
        this.ptime=ptime;
    }
    void putData()
    {
        super.putData();
        System.out.println("Play time" +ptime);
    }
}

class pbdemo{
    public static void main(String[] args) {
        publication p=new publication();
        p.putData();
    }
}