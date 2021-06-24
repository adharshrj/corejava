class Shape
{
  public int area(int s)
   {
   return(s*s);
   }
    public float area(int l)
   {
 return(l*l);
   }
  public float area(float r)
    {
   return(3.14f*r*r);
   }
}
class SDemo
{
   public static void main(String a[])
     {
     Shape s=new Shape();
     System.out.println("Area of Square:"+s.area(10));
      System.out.println("Area of Circle:"+s.area(10.0f));
      System.out.println("Area of Rectangle:"+s.area(10,20));
    }
}