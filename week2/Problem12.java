package week2;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=1 ;k<=((2*(n-1))-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


