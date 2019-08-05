package JavaRush;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);
        if (a>0 && b>0 && c>0)
            System.out.println("3");
        if(a<=0 && b<=0 && c<=0)
            System.out.println("0");
        if(a>0 && b<= 0 && c<= 0)
            System.out.println("1");
        if(a<=0 && b>0 && c<=0)
            System.out.println("1");
        if(a<=0 && b<=0 && c>0)
            System.out.println("1");
        if(a>0 && b>0 && c<=0)
            System.out.println("2");
        if(a>0 && b<=0 && c>0)
            System.out.println("2");
        if(a<=0 && b>0 && c>0)
            System.out.println("2");

}}
