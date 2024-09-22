class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*if(nums.length<k)
        {
            return -1.00000;
        }*/
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int maxSum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            maxSum=Math.max(sum,maxSum);
        }

        /*int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=nums[j];
            }
            maxSum=Math.max(sum,maxSum);
        }*/
        return (double)maxSum/k;
    }
}