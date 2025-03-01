package week2;
import java.util.Scanner;
public class SumFirstLast {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ln=n%10;
        int fd=0;
        if (n < 10) {
            System.out.println(n);
            return ;
        }
        while(n>0){
            int fn=n%10;
            /*if(n==fn){
                fd=fn;
            }*/
            n=n/10;

        }
        System.out.println(ln+fd);
    }
}
