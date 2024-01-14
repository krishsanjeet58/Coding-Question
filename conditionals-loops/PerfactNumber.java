import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();

        int n=number;
        int sum=1;
        int p=2;
        while (p<=n/2){
        if(number%p==0){
            sum+=p;
        }
        p++;
        }
        System.out.println(sum==number);
    }
}