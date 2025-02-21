package Freaks;
import java.util.Scanner;
public class ProbTwo {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        int result=a+b+c;

        if(result==180){
          System.out.println("triangle can be formed");
        }
        else {
            System.out.println("triangle cannot be formed");
        }
    }

}
