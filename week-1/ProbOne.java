package Freaks;
import java.util.Scanner;
public class ProbOne {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String name=scan.next();
        char ch=scan.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(ch);
    }
}
