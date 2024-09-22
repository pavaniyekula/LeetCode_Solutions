class Solution {
    public int dominantIndex(int[] nums) {
        int arr[]=new int[nums.length];
        System.arraycopy(nums,0,arr,0,nums.length);
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[nums.length-1]<2*nums[i])
                return -1;
            else
                continue;
        }
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==nums[nums.length-1])
            {
                index=i;
            }
        }
        return index;
    }
}