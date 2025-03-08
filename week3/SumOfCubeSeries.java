package week3;
import java.util.Scanner;
public class SumOfCubeSeries {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int n=scan.nextInt();
        for(int i=0;i<=n;i++){
        sum=sum+(i*i*i);
        }
        System.out.println(sum);
    }
}
