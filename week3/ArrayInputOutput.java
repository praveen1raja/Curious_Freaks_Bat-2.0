package week3;
import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
