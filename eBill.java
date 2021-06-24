import java.util.Scanner;
                
class eBill {
    
private static Scanner sc;
public static void main(String[] args){
    int consumerno;
    String consumername;
    float currentread;
    float previousread;
    String type;
    sc = new Scanner(System.in);
    System.out.print(" Enter the type of connection (domestic or commercial )  : ");
    type = sc.next();
    
    if(type == domestic){
        int Units;
        int Amount;
        sc = new Scanner(System.in);
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
        
        if (Units>500){
           Amount = Units * 6;
        }else if (Units>200){
            Amount = Units*4;
        }else if (Units>100){
            Amount = Units*2.5;
        }else {
            Amount = Units*1;
        }
        System.out.println("The amount is" +Amount);
    }
    else (type == commercial){
            int Unitsc;
            int Amountc;
            sc = new Scanner(System.in);
            System.out.print(" Please Enter the Units that you Consumed  : ");
            Unitsc = sc.nextInt();
            
            if (Unitsc>500){
               Amountc = Units * 7;
            }else if (Unitsc>200){
                Amountc = Units*6;
            }else if (Unitsc>100){
                Amountc = Unitcs*4.5;
            }else {
                Amountc = Units*2;
            }
        System.out.println("The amount is:" +Amountc)
    }
    }
}
}