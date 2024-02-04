import java.util.Arrays;

public class MedianAdjustment {
    public static long minMovesToMedian(int n, int[] prices, int k) {
        Arrays.sort(prices);
        int  M=(n+1)/2;
        long moves=Math.abs(prices[M-1]-k);
        prices[M-1]=k;
        if(n==1){
            return moves;
        }
        else
        if(prices[M-1]<=prices[M] && prices[M-1]>=prices[M-2]){
            return moves;
        }
        else if(prices[M-1]>prices[M]) {
            int i = M - 1;
            while (i<n-1 && prices[i] > prices[i + 1]) {
                moves +=Math.abs( prices[i + 1] - k);
                prices[i+1]=k;
                i++;

            }
            return moves;
        }
            else{
                int i=M-1;
                while ( i>0 && prices[i] < prices[i - 1]){
                    moves+=Math.abs(prices[i - 1]-k);
                    prices[i-1]=k;
                    i--;

            }
                return moves;
        }


    }

    public static void main(String[] args) {

        int[] prices = {3,3,6,3,9};
        int n=prices.length;
        int k = 2;
        long result = minMovesToMedian(n, prices, k);
        System.out.println(result);
    }
}
