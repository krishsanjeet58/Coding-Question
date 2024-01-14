import java.util.Scanner;
import java.util.*;
public class CalculateElectricBill {
    static int ElectricBill(int unit){
        int price[]={10,15,20,25};
        int ranges[]={100,100,100,Integer.MAX_VALUE};
        int bill=0;
        for (int i=0;i<ranges.length;i++){
            if(unit<=ranges[i]){
                bill+=price[i]*unit;
            }
            else {
                bill+=100*price[i];
                unit=unit-100;
            }
        }
        return bill;

    }
    public static void main(String[] args) {
       /* 1 to 100 -10rs /unit
          100 to 200 -15rs/unit
          200 to 300 -20rs/unit
          300 to above- 25rs/unit
        */

        Scanner input=new Scanner(System.in);
        int unit= input.nextInt();


        if(unit<=100){
            System.out.println(unit*10);
        }
        else if(unit>100 && unit <=200){
            System.out.println(100*10+(unit-100)*15);
        } else if (unit>200 && unit <=300) {
            System.out.println(100*10+100*15+(unit-200)*20);
        } else if (unit>300) {
            System.out.println(100*10+100*15+100*20+(unit-300)*25);
        }

//      second method
        int unit1=input.nextInt();

        System.out.println(ElectricBill(unit1));
    }
}