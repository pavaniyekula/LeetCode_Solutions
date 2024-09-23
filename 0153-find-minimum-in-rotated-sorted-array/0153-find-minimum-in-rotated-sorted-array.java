class Solution {
    public int findMin(int[] nums) {
        //binary search
        int i=0;
        int j=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[j])
            {
                i=mid+1;
            }
            else if(nums[mid]<=nums[j])
            {
                min=Math.min(min,nums[mid]);
                j=mid-1;
            }
        }
        return min;
    }
}