public class LongestCommonsubcequence {

    static int longestCommonsubcequence(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int [][]t=new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0|| j==0){
                    t[i][j]=0;
                } else if (str1.charAt(i-1)==str2.charAt(j-1)) {
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][m];
    }

    public static void main(String[] args) {
        String str1="abddkklpk";
        String str2="adrvmojjek";

       System.out.println(longestCommonsubcequence(str1,str2));
    }
}
