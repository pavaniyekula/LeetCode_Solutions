class Solution {
    static int f(int n, int arr[], int dp[])
    {
        if(n==0)  return arr[n];
        if(n<0) return 0;
        if (dp[n] != -1) return dp[n];
        dp[n]=Math.max(arr[n]+f(n-2,arr,dp),f(n-1,arr,dp));
        return dp[n];
    }
    public int rob(int[] arr) {
        if(arr.length==0) return 0;
        int dp[]=new int[arr.length];
        Arrays.fill(dp, -1);  
        return f(arr.length-1,arr,dp);
    }
}