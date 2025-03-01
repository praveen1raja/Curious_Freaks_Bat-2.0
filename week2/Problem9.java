package week2;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int k=1;k<=(n-1)-i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
