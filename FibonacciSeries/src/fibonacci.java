import java.io.*;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
    int n;
    int a =0;
    int b =1;
    int c;
    System.out.println("Fibonacci Series Number");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Range of the Series you want : ");
    n = scan.nextInt();
    System.out.println(a);
        System.out.println(b);
 for (int i = 3 ; i <= n; i++){
     c= a+b;
     System.out.println(c);
     a=b;
     b=c;
 }
    }
}