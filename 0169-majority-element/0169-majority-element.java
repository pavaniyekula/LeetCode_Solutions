class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> freq=new HashMap<>();
        int maxFreq=1;
        for(int i=0;i<nums.length;i++)
        {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])>maxFreq && freq.get(nums[i])>nums.length/2)
            {
                maxFreq=freq.get(nums[i]);
                return nums[i];
            }
        }
        return nums[0];
    }
}