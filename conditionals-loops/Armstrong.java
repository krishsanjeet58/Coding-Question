import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int number=n;
        int count=0;
        //calculate digit
        while(number>0){
            number=number/10;
            count++;
        }
        int ArmstronNumber=0;
        number=n;
        for (int i=0;i<count;i++){
            ArmstronNumber+=Math.pow(n%10,count);
            n=n/10;
        }
        System.out.println(ArmstronNumber==number);
    }
}