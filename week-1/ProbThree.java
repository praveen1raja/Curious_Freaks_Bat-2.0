package Freaks;
import java.util.Scanner;
public class ProbThree {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int  marks=scan.nextInt();

        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade B");
        }
        else if(marks>=60 && marks<80){
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("fail");
        }
    }
}
