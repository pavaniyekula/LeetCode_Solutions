class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int count[]=new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int maxLen=1;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[i]<dp[j]+1)
                    {
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }
                    else if(dp[i]==dp[j]+1)
                    {
                        count[i]+=count[j];
                    }
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        int lisCount=0;
        for(int i=0;i<dp.length;i++)
        {
            if(dp[i]==maxLen) lisCount+=count[i];
        }
        return lisCount;
    }

}