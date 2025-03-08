package week3;
import java.util.Scanner;
public class SquaresDifference {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long Firstsum=0;
        long Secondsum=0;
        for(int i=1;i<=n;i++){
            Firstsum=Firstsum+(i*i);
            Secondsum=Secondsum+i;
        }
        Secondsum=Secondsum * Secondsum;
        System.out.println(Secondsum-Firstsum);
    }
}
