interface Shape
{
   void display();

}
class Circle implements Shape
{
   public void display()
   {
   System.out.println("Circle");
   }
  
}
class Rectangle implements Shape
{
  public void display()
   {
   System.out.println("Rectangle");
   }
}

class ADemo
{
  public static void main(String a[])
   {
   Shape s1=new Circle();
  Shape s2=new Rectangle();
   s1.display();
   s2.display();
   }
}

  