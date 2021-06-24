class X
{

 private int i;
 private static int s=1;
 
 X()
  {
  i=s;
   s++;
  }
  void display()
   {
  System.out.println("i="+i);
    System.out.println("s="+s);    
  }
  static void sdisplay()
  {
    System.out.println("s="+s);
    }
  
}
class XDemo
{
  public static void main(String a[])
   {
   X x1=new X();
   X x2=new X();
   x1.display();
   x2.display();
   X.sdisplay();
   }
}