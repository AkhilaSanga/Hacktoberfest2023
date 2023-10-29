//KnapsackProblem

public class Knapsack{
    public static int knapSack(int N, int W, int[] val, int[] wt) {
        int[] dp = new int[W + 1];
        
        for (int w = 1; w <= W; w++) {
            for (int i = 0; i < N; i++) {
                if (wt[i] <= w) {
                    dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
                }
            }
        }
        
        return dp[W];
    }
    
    public static void main(String[] args) {
        int N = 2;
        int W = 3;
        int[] val = {1, 1};
        int[] wt = {2, 1};
        int result = knapSack(N, W, val, wt);
        System.out.println("Maximum profit: " + result);  // Output: 3
        
        N = 4;
        W = 8;
        int[] val2 = {6, 1, 7, 7};
        int[] wt2 = {1, 3, 4, 5};
        result = knapSack(N, W, val2, wt2);
        System.out.println("Maximum profit: " + result);  // Output: 48
    }
}
