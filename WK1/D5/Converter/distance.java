package WK1.D5.Converter;

import java.io.*;
import java.util.*;

public class distance {
    
    int type;
    double km, mil, val;
    Scanner s = new Scanner(System.in);
    
    public void read(){
        System.out.println("Enter type");
        System.out.println("KM");
        System.out.println("MILE");
        System.out.print("Enter option");

        type = Integer.parseInt(s.nextLine().trim());

        System.out.print("Enter Value");

        val = Double.parseDouble(s.nextLine().trim());
    }
    public void conversion(){
        System.out.println("Converting");
        switch(type){
            case 1: mil = val*0.6213712;
            System.out.println("KM=" +val);
            System.out.println("Mile=" +mil);
            break;

            case 2: km = val*1.609344;
            System.out.println("KM" +val);
            System.out.println("Mile" +inr);
            break;
        }
    }
}