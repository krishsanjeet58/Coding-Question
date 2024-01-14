import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String name=input.next();
        String reverse="";
        for(int n=name.length()-1;n>=0;n--){
            reverse+=name.charAt(n);
        }
        System.out.println(reverse);
    }
}