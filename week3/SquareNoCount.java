package week3;
import java.util.Scanner;
public class SquareNoCount {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int counter=0;
        for(int i=1;i*i<n;i++){
            counter=counter+1;
        }
        System.out.println(counter);
    }
}
