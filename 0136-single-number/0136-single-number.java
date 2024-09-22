class Solution {
    public int singleNumber(int[] nums) {
        /*
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int ele:nums)
        {
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(freq.get(nums[i])==1)
            return nums[i];
        }
        return -1;*/
        /*int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(k>=0 && nums[i]==nums[i-k])
            {
                return nums[i];
            }
            k++;
        }
        return -1;*/
        
        int k=0;
        for(int ele:nums)
        {
            k^=ele;
        }
        return k;
    }
}