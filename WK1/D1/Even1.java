class Even1
   {
    public static void main(String a[])
     {
       int n=Integer.parseInt(a[0]);
        if(n>=0)
          {
         if(n%2==0)
         System.out.println(n+" is Even no");
        else
         System.out.println(n+" is Odd no");
         }
        else
         System.out.println("Given no is negative");
        
     }
}