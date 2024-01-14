import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int n= input.nextInt();
        int fact =1;
        for (int i=1;i<=5;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}