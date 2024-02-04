import java.util.Scanner;

public class LongestRepeatingSubsequence {
    static int RepeatingSubcequence(String str){
        int n=str.length();
        int [][]t=new int[n+1][n+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                } else if (str.charAt(i-1)==str.charAt(j-1) && i!=j) {
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][n];
    }

    static String PrintRepeatingSubsequence(String str){

        // matrix filled with longest Repeating subsequence
        int n=str.length();
        int [][]t=new int[n+1][n+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                } else if (str.charAt(i-1)==str.charAt(j-1) && i!=j) {
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        // printing the longest Repeating subsequence
        int i=n,j=n;
        String out="";
       while (i>0 && j>0){
           if(str.charAt(i-1)==str.charAt(j-1) && i!=j){
               out+=str.charAt(i-1);
               i--;
               j--;
           }
           else if(t[i-1][j]>t[i][j-1]){
               i--;
           }
           else{
               j--;
           }
       }

       String output="";
       for( i=out.length()-1;i>=0;i--){
          output+=out.charAt(i);
        }
       return output;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
       int length= RepeatingSubcequence(str);
    System.out.println(length);
    System.out.println(PrintRepeatingSubsequence(str));
    }
}
