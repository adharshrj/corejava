class RN
  {
  public static void main(String a[])
    {
    int n=Integer.parseInt(a[0]);
    int r=0;
    do
     {
     r=r*10+n%10;
     n=n/10;
     }while(n>0);
    System.out.println(r);
   }
}