class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                if(nums[i]<nums[j] && nums[j]<nums[k]) return true;
                else if(nums[i]>=nums[j]) j++;
                else if(nums[j]>=nums[k]) k--;
            }
        }
        return false;*/
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(num<=first) first=num;
            else if(num<=second) second=num;
            else return true;
        }
        return false;
    }
}