package week2;
import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int counter=0;
        while(n>0){
            int ld=n%10;
            //System.out.println(ld);
            counter=counter+1;
            n=n/10;
        }
        System.out.println(counter);
    }
}
