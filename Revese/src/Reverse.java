import java.util.*;
import java.io.*;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("This Programme is making any number reverse");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number which you want reverse");
        int REV = scan.nextInt();
        if (REV < 10 ) {
            System.out.println("The number is " + REV);
        }
        else{
            System.out.print(REV%10);
                System.out.print(REV/10);
            }

        }
    }
