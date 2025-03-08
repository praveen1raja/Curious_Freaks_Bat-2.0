package week3;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int orginal=n;
        int sum=0;
        while(n>0){
            int ld= n%10;
            sum=sum*10+ld;
            n=n/10;
        }
        System.out.println(sum);
        if (sum==orginal) {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
