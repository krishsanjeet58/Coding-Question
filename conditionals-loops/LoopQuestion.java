import java.util.Scanner;

public class LoopQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveSum = 0, nagativeSum = 0, oddSum = 0;
        while (true) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }

            if (n % 2 != 0 ) {
                oddSum += n;
            }
            if (n > 0) {
                positiveSum += n;
            } else {
                nagativeSum += n;
            }


        }
        System.out.println("positive sum : "+positiveSum+" nagative sum : "+nagativeSum+" odd Sum : "+oddSum);
    }
}