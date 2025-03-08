package week3;
import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

       for (int i=2;i<=n;i++){
           int count=0;
           for(int j=2;j<=i;j++){       //no need to check till n numbers because it will give value in 0 for every time we can check till i number
               if(i%j==0) {
                   count = count + 1;
               }
           }
           if(count==1){
               System.out.print(i+" ");
           }
       }

    }
}
