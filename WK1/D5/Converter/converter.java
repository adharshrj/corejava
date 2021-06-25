package WK1.D5.Converter;
import java.util.*;
import java.io.*;

public class converter {
    public static void main(String a[]) {
        currency c1=new currency();
        c1.read();
        c1.conversion();

        distance d1=new distance();
        d1.read();
        d1.conversion();

        time t1=new time();
        t1.read();
        t1.conversion();
    }
}
