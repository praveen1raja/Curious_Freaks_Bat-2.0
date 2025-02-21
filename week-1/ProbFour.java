package Freaks;
import java.util.Scanner;
public class ProbFour {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        switch(num){
            case 28:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }
}
