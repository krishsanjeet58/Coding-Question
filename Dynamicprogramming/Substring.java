import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int m=s1.length();
        int n=s2.length();
        int[][] t=new int[m+1][n+1];

        for (int i=0;i<s1.length()+1;i++){
            for(int j=0;j<s2.length()+1;j++){
                if(i==0 || j==0 ){
                    t[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else {
                    t[i][j]=0;
                }
            }
        }
        System.out.println(t[m][n]);
    }
}
