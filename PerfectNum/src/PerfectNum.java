import java.io.*;
import java.util.*;

public interface PerfectNum {
    public static void main(String[] args) {
        System.out.println("This is Perfect Number Programme");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value :");
        int P = scan.nextInt();
        int i, sum =0;
        for (i =1 ; i <=P; i++){

            if(P % 1 == 0);
            {
                sum = sum + i;
            }
        }
        if(sum == P) {
            System.out.println("It is a perfect number " + P);
        }else {
            System.out.println("It is Not a perfect number " + P);
        }
    }

}
