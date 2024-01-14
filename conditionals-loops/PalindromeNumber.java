import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number =input.nextInt();
        int p=number;
        int reverse=0;
       while (p>0){

           reverse=reverse*10+p%10;
           p=p/10;
       }
       System.out.println(reverse);
       if(reverse == number){
           System.out.println("this is palindrom number");
       } else  {
           System.out.println("this is not palindrom number");
       }
    }
}