package Freaks;
import java.util.Scanner;
public class ProbSeven {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Name:");
        String FirstName =scan.nextLine();
        System.out.println("Enter the Last Name:");
        String LastName =scan.nextLine();
        System.out.println("Enter the no of time to print:");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(FirstName+LastName);
        }
    }
}
