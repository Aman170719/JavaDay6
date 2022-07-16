import java.io.*;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("To Check that number is Prime or Not");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number which you want to check");
        int Number = scan.nextInt();
        boolean flag = false;
        for(int i =2; i <= Number/2 ; i++){
            if(Number%1 ==0){
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println("The number is a prime");
        }
        else {
            System.out.println("The number is not a prime");
        }
    }

}