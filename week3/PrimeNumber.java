package week3;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Boolean IsPrime = true;

        for (int i = 2; i <n ; i++) {
            if (n % i == 0) {
                IsPrime = false;
                break;
            }
        }
        if (IsPrime) {
            System.out.println("Prime number");
        }else
            System.out.println("not prime number");
    }
}


