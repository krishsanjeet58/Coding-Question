import java.util.Collection;
import java.util.Collections;

public class MinimumInsertionPelimdrome {
    static int minimumInsertionPelimdrome(String str){

        int n=str.length();
        String str1="";
        for (int i=n-1;i>=0;i--)
            str1+=str.charAt(i);

        return n- LongestCommonsubcequence.longestCommonsubcequence(str,str1);
    }
    public static void main(String[] args) {
            String str="adfghyfda";
            System.out.println(minimumInsertionPelimdrome(str));
    }
}
