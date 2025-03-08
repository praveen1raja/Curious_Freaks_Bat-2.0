package week3;
import java.util.Scanner;
public class GcdOfNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int gcd=1;
        if(a>=b){
            for(int i =1;i<=b;i++){
                if(b%i==0 && a%i==0){
                    gcd=i;
                }
            System.out.print(gcd);
            }
        }
        else {
            for(int i =1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    gcd=i;
                }
            }
            System.out.print(gcd);

        }

    }
}
