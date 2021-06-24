class Publication
{
  private String title;
  private float price;
   Publication(String title,float price)
   {
   this.title=title;
   this.price=price;
   }
  void putData()
   {
   System.out.println("Title:"+title);
   System.out.println("Price:"+price);
   }
}
class Book extends Publication
{
     private int pages;
     Book(String title,float price,int pages)
      {
     super(title,price);
     this.pages=pages;
      }
    void putData()
     {
     super.putData();
     System.out.println("No of Pages:"+pages);
     }
}
class ScienceBook extends Book
{
    private int ne;
    ScienceBook(String title,float price,int pages,int ne)
      {
     super(title,price,pages);
     this.ne=ne;
      }
    void putData()
     {
     super.putData();
     System.out.println("No of Experiments:"+ne);
     }
}

class PDemo
{
  public static void main(String a[])
    {
    Publication p=new ScienceBook("Java",500.0f,1000,20);
       p.putData();
   }
}