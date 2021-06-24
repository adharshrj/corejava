import java.util.Scanner;
class primeAndSum
{
    public static void main(String a[]) {
        {
         int n, dig, sum=0;
         Scanner sc = new Scanner(System.in);  
         System.out.print("Enter the number: ");  
         n= sc.nextInt();  
         boolean x=false;
         for (int i=2; i<=n/2; i++) {
             if (n%i==0){
             x=true;
             break;
             }
         }
           
        if (!x)
         System.out.println(n+ "is prime");
        else
         System.out.println(n+ "is not prime");

        sum=0;

         while (n>0)
        {
            dig=n%10;
            sum=sum+dig;
            n=n/10;
        }

         System.out.println("Sum is" +sum);
        }
        
    }
}