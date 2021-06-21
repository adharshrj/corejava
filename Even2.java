class Even2
   {
    public static void main(String a[])
     {
       int n=Integer.parseInt(a[0]);
        switch(n%2)
          {
         case 0:
         System.out.println(n+" is Even no");
          break;
        case 1:
         System.out.println(n+" is Odd no");
         break;
         }
             
     }
}