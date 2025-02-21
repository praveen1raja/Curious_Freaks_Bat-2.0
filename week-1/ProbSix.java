package Freaks;
import java.util.Scanner;
public class ProbSix {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
       for(int i=1;i*num<=1000;i++){
           int n=num*i;
           System.out.println(n);
       }

    }
}
