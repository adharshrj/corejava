class publication{
    private String title;
    private float price;
    void data(String title, float price)
    {
        this.title=title;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title:"+ title);
        System.out.println("Price:"+ price);
    }
}

class book extends publication{
    private int pages;
    void data(String title, float price, int pages){
        data(title,price);
        this.pages=pages;
    }
    void display()
    {
        super.display();
        System.out.println("Page No." +pages);
    }
}

class cd extends publication{
    private int ptime;
    void data(String title, float price, int ptime){
        data(title,price);
        this.ptime=ptime;
    }
    void display()
    {
        super.display();
        System.out.println("Playing time" +ptime);
    }
}

class PublicationRun{
    public static void main(String[] args) {
        book b=new book();
        b.data("Narnia", 5200.0f, 4300);
        b.display();
        cd c=new cd();
        c.data("Eminem",768.3f, 3576);
        c.display();
    }
}