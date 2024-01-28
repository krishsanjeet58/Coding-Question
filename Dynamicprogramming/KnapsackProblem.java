import java.util.Scanner;

import static java.lang.Math.max;

public class KnapsackProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        int w= sc.nextInt();
        System.out.println(knapsackproblem(wt,val,w,n));

    }

    // recursive solution
    static int knapsackproblem(int wt[],int val[],int w,int n){
        if(n==0 || w==0){
            return 0;
        }
        int profit = 0;
        if(wt[n-1]<=w){
            return max(val[n-1]+knapsackproblem(wt,val,w-wt[n-1],n-1),knapsackproblem(wt,val,w,n-1));
        }
        return (knapsackproblem(wt,val,w,n-1));

    }

    //dp solution
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int p[][]=new int[n+1][W+1];
        // base condition
        for (int i=0;i<n+1;i++){
            for (int j=0;j<W+1;j++){
                if(i==0||j==0){
                    p[i][j]= 0;
                }
                else  if(wt[i-1]<=j){
                    p[i][j]=Math.max( (val[i-1]+p[i-1][j-wt[i-1]]),p[i-1][j]);
                }
                else{
                    p[i][j]=(p[i-1][j]);
                }
            }
        }



        return p[n][W];
    }
}