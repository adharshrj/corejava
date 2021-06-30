package WK2.D2.listsum;

import java.util.*;
import java.io.*;


public class listsumwhileloop {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(); //create array list
        list.add(52);                            //list.add to add list elements
        list.add(61);
        list.add(77);
        list.add(10);
        list.add(94);
        int sum = 0;
        int i;
        int n;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
