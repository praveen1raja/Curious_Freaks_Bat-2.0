package week2;
import java.util.Scanner;
public class ProbTwo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=(n-i)+1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

