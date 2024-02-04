import java.util.Scanner;

public class SequencepatternMatching {

    // a="axy"
    //b="adxcpy"

    //output is true

    static boolean sequencepatternmatching(String a,String b){
        int m=a.length();
        int n=b.length();
        int [][]t=new int[m+1][n+1];
        for (int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(j==0){
                    t[i][j]=0;
                }else
                if(i==0){
                    t[i][j]=0;
                }
                else
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        if(t[m][n]==m || t[m][n]==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        String a=SC.next();
        String b=SC.next();

        System.out.println(sequencepatternmatching(a,b));
    }
}
