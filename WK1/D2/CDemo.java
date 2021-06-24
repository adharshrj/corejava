class ComplexNo
{
 private int rp,ip;
 public ComplexNo()
 {
 this(0,0);
 }
 public ComplexNo(int rp,int ip)
    {
     this.rp=rp;
     this.ip=ip;
     }
  public ComplexNo(ComplexNo c)
   {
   rp=c.rp;
   ip=c.ip;
   }
  public void display()
   {
   System.out.println(rp+"+i"+ip);
   }
}
class CDemo
{
 public static void main(String a[])
  {
   ComplexNo c1=new ComplexNo();
   c1.display();
   ComplexNo c2=new ComplexNo(10,15);
   c2.display();
   ComplexNo c3=new ComplexNo(c2);
   c3.display();
   }
}
 