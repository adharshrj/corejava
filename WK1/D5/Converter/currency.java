package WK1.D5.Converter;

import java.io.*;
import java.util.*;

public class currency {
    int type;
    double inr, usd, eur, yen, val;
    Scanner s = new Scanner(System.in);
    
    public void read(){
        System.out.println("Enter type");
        System.out.println("INR");
        System.out.println("USD");
        System.out.println("EUR");
        System.out.println("YEN");
        System.out.print("Enter option");

        type = Integer.parseInt(s.nextLine().trim());

        System.out.print("Enter Value");

        val = Double.parseDouble(s.nextLine().trim());
    }
    public void conversion(){
        System.out.println("Converting");
        switch(type){
            case 1: inr = val*74.19;
            System.out.println("USD=" +val);
            System.out.println("INR=" +inr);
            break;

            case 2: inr = val*88.49;
            System.out.println("EUR=" +val);
            System.out.println("INR=" +inr);
            break;

            case 3: inr = val*0.67;
            System.out.println("YEN=" +val);
            System.out.println("INR=" +inr);
            break;

            case 4:usd = val/74.19;
                   eur = val/88.49;
                   yen = val/0.67;
            System.out.println("USD=" +usd);
            System.out.println("EUR=" +eur);
            System.out.println("YEN=" +yen);
            break;
        }
    }
}
