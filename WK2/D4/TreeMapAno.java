package WK2.D4;

import java.util.*;

class Account{
    private int ano;
    private int balance;
    Account(int ano,int balance)
    {
        this.ano=ano;
        this.balance=balance;
    }
    public String toString(){
        return( "Account Number = " + ano + "Balance = " + balance);
    }
}

public class TreeMapAno {
    public static void main(String[] args) {
        TreeMap<String,Account> tm =new TreeMap<String,Account>();
        tm.put("Ram", new Account(125,22446));
        tm.put("Laxman", new Account(427,856755));
        tm.put("Sita",new Account(552,5567567));
        Set<Map.Entry<String,Account>> s = tm.entrySet();
        for(Map.Entry<String,Account> me:s)
        {
            System.out.println(me.getKey()+" "+me.getValue());
        }
        
    }
    
}
