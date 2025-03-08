package week3;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
    }
}
